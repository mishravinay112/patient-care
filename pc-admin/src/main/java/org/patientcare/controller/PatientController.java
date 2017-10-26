package org.patientcare.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.patientcare.model.AdminLogin;
import org.patientcare.model.Patient;
import org.patientcare.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController
{
	@Autowired
	PatientService patientService;
	

	
	@RequestMapping(value = { "/imageDisplay"}, method =RequestMethod.GET)
	public void getPatientImage(@RequestParam("pid") Long pid, HttpServletResponse response)
	{
		InputStream is=patientService.getImage(pid);
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
		    System.out.println("gayi image : "+pid);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = { "/addPatient"}, method = RequestMethod.GET)
	public String newPatient(HttpServletRequest req)
	{
		req.setAttribute("patient", new Patient());
		return "newPatient";
		
	}
	
	@RequestMapping(value = { "/addPatient"}, method = RequestMethod.POST)
	public String addPatient(@ModelAttribute("patient")Patient patient)
	{
		
		patient.setPid(System.currentTimeMillis());
		try
		{
			System.out.println("Bytes Length : "+patient.getPatientImageFile().getBytes().length);
		}
		catch (IOException e)
		{
			System.out.println("patient ke data ki image post nahi ho paa rahi");
			e.printStackTrace();
		}
		System.out.println("patient id : "+patient.getPid());
		System.out.println("name : "+patient.getName());
		System.out.println("desease : "+patient.getDisease());
		System.out.println("careTeam : "+patient.getCareTeam());
		System.out.println("doctor : "+patient.getDoctor());
		
		boolean status=patientService.savePatient(patient);
		if(status)
		{
			System.out.println("\npatient data save successfully");
		}
		else
		{
			System.out.println("somthing wrong.............\n data not saved");
		}
		
		return "welcome";
	}
	
	@RequestMapping(value = { "/viewPatient"}, method = RequestMethod.GET)
	public String viewPatient(HttpServletRequest req,ModelAndView model)
	{
		
		
		int from=0;
		String temp=req.getParameter("from");
		if(temp!=null)
		{
			from=Integer.parseInt(temp);
			System.out.println("from : "+from);
		}
		
		
		ArrayList<Patient>patients=patientService.getPatients(from);
		//model.addObject("patients",patients);//yah tabhi chalega jab spring ke tag use kre iteration ke liye.
		//agar jstl use krna hai to data request me setAttribute kare.
		
		req.setAttribute("patients", patients);
		for (int i = 0; i < patients.size(); i++)
		{
			Patient patient=patients.get(i);
			
			System.out.println((" \npatient"+(i+1)+"\n"));
			System.out.println("patient id : "+patient.getPid());
			System.out.println("patient image : "+patient.getImage());
			System.out.println("name : "+patient.getName());
			System.out.println("desease : "+patient.getDisease());
			System.out.println("careTeam : "+patient.getCareTeam());
			System.out.println("doctor : "+patient.getDoctor());
		}
	
		return "showAll";
		
	}

	
}
