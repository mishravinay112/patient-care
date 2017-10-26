package org.patientcare.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.patientcare.model.AdminLogin;
import org.patientcare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class LoginController 
{

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = { "/login"}, method = RequestMethod.GET)
	public ModelAndView loginPage(ModelAndView model )
	{
		model.addObject("admin", new AdminLogin());//yaha jis name add kiya hai usi name se modelAttribute me milega.............login.jsp pr bhi yahi name dena hai in modelAttribute
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = { "/signIn"}, method = RequestMethod.POST)
	public String signIn(@ModelAttribute("admin")AdminLogin admin,HttpSession session) throws Exception //yah vahi object hai jo hamne uper "login" me bind kiya tha. yahi fill hoke aaya hai AdminUser se
	{
		/*admin.setEmailId(req.getParameter("username"));
		admin.setPassword(req.getParameter("password"));*/
		System.out.println(admin.getEmailId());
		System.out.println(admin.getPassword());
		//System.out.println(admin.getName());
		
		admin=loginService.adminSignIn(admin); 
		
		
		if(admin==null)
		{
			return "login";
		}
		
		session.setAttribute("user", admin);
		return "welcome";
	}
	
	@RequestMapping(value = { "/userImage"}, method =RequestMethod.GET)
	public void getPatientImage(@RequestParam("id") Integer id, HttpServletResponse response,HttpServletRequest request)
	{
		InputStream is=loginService.getImage(id);
		if(is==null)
		{
			System.out.println("image nahi aayi");
		}
		try 
		{
			byte[] img= IOUtils.toByteArray(is);
			response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		    response.getOutputStream().write(img);
		    response.getOutputStream().close();
		    System.out.println("gayi image : "+id);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
