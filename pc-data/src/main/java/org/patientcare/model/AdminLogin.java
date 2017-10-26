package org.patientcare.model;

import java.io.Serializable;

public class AdminLogin implements Serializable
{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String emailId;
	private String password;
	private Integer isDeleted;
	private String name;
	private String username;
	private String date;
	private Integer roleId;
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	public String getEmailId() 
	{
		return emailId;
	}
	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getDate()
	{
		return date;
	}
	public void setDate(String date)
	{
		this.date = date;
	}
	public Integer getRoleId() 
	{
		return roleId;
	}
	public void setRoleId(Integer roleId)
	{
		this.roleId = roleId;
	}
	
	
	
}
