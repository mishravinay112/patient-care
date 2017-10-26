package org.patientcare.service;

import java.io.InputStream;

import org.patientcare.model.AdminLogin;
import org.patientcare.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService 
{
	@Autowired
	private LoginRepository loginRepository;

	public AdminLogin adminSignIn(AdminLogin admin) throws Exception 
	{
		AdminLogin loginMember = (AdminLogin) admin;
		
		if (admin != null)
		{
			if(loginMember.getEmailId()!=null && loginMember.getPassword()!=null)
			{
				loginMember= loginRepository.adminSignIn(loginMember.getEmailId(), loginMember.getPassword());
			}
			return loginMember;
		}
		else
		{
			return admin;
		}
	}

	public InputStream getImage(Integer id) 
	{
		InputStream  patientImage=loginRepository.getImage(id); 
		return patientImage;
	}
	
}
