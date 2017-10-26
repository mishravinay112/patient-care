package org.patientcare.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.patientcare.connection.JdbcConfig;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorRepository 
{

	public static List<String> getDoctors()
	{
		List<String> doctor=new ArrayList<String>();
		try
		{
			Connection con=JdbcConfig.getConnection();
			String query="select name from doctors";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				doctor.add(rs.getString(1));
			}
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		return doctor;
	}
}
