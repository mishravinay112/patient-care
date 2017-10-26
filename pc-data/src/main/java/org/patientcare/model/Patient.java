package org.patientcare.model;

import java.io.InputStream;
import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

public class Patient
{
	private long pid;
	private String name;
	private InputStream image;
	private MultipartFile patientImageFile;
	private ArrayList<String> disease=new ArrayList<String>();
	private ArrayList<String>careTeam=new ArrayList<String>();
	private ArrayList<String>doctor=new ArrayList<String>();
	
	public long getPid()
	{
		return pid;
	}
	public void setPid(long pid)
	{
		this.pid = pid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public InputStream getImage()
	{
		return image;
	}
	public void setImage(InputStream image) 
	{
		this.image = image;
	}
	public MultipartFile getPatientImageFile() 
	{
		return patientImageFile;
	}
	public void setPatientImageFile(MultipartFile patientImageFile)
	{
		this.patientImageFile = patientImageFile;
	}
	public ArrayList<String> getDisease()
	{
		return disease;
	}
	public void setDisease(ArrayList<String> disease)
	{
		this.disease = disease;
	}
	public ArrayList<String> getCareTeam()
	{
		return careTeam;
	}
	public void setCareTeam(ArrayList<String> careTeam)
	{
		this.careTeam = careTeam;
	}
	public ArrayList<String> getDoctor() 
	{
		return doctor;
	}
	public void setDoctor(ArrayList<String> doctor)
	{
		this.doctor = doctor;
	}
	
	
	
	
	
	
}
