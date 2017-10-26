package org.patientcare.repository;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.patientcare.connection.JdbcConfig;
import org.patientcare.model.AdminLogin;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepository 
{

	public AdminLogin adminSignIn(String emailId, String password) throws Exception 
	{
		AdminLogin adminMember=new AdminLogin();
		adminMember.setEmailId(emailId);
		adminMember.setPassword(password);
		Connection con = JdbcConfig.getConnection();
		String query="select id, name, username, password, email_id, role_id, is_deleted, date from admin where email_id='"+emailId+"' and password='"+password+"'";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		boolean check=false;
		while(rs.next())
		{
			check=true;
			adminMember.setId(rs.getInt(1));
			adminMember.setName(rs.getString(2));
			adminMember.setUsername(rs.getString(3));
			adminMember.setRoleId(rs.getInt(6));
			adminMember.setIsDeleted(rs.getInt(7));
			adminMember.setDate(rs.getString(8));
			
		}
		if(!check)
		{
			adminMember=null;
		}
		/*PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, emailId);
		ps.setString(2, password);
		ps.executeQuery();*/
		return adminMember;
	}

	public InputStream getImage(Integer id) 
	{
		InputStream image=null;
		try
		{
			Connection con=JdbcConfig.getConnection();
			String query="select image from admin where id="+id;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			int check=1;
			while(rs.next())
			{
				System.out.println(id+"user ki image aa gayi hai "+check+" bar chala");
				image=rs.getBinaryStream(1);
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return image;
	}

}
