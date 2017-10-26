package org.patientcare.repository;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.patientcare.connection.JdbcConfig;
import org.patientcare.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository
{
		
	public boolean savePatient(Patient patient)
	{
		try 
		{
			Connection con = JdbcConfig.getConnection();
			String query="insert into patient(pid,name,image) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setLong(1, patient.getPid());
			ps.setString(2, patient.getName());
			ps.setBinaryStream(3, patient.getPatientImageFile().getInputStream());
			int p=ps.executeUpdate();
			System.out.println("patient entry submitted : "+p);
			
			String query1="insert into patient_careteam(pid,careteam) values";
			for(int i=0;i<patient.getCareTeam().size()-1;i++)
			{
				query1+="(?,?),";
			}
			query1+="(?,?)";
			System.out.println("\n\n"+query1);
			PreparedStatement ps1=con.prepareStatement(query1);
			int index=1;
			for(int i=0;i<patient.getCareTeam().size();i++)
			{
				ps1.setLong(index++, patient.getPid());
				ps1.setString(index++, patient.getCareTeam().get(i));
			}
			int p1=ps1.executeUpdate();
			System.out.println("patient_careteam entry submitted : "+p1);
			
			String query2="insert into patient_doctor(pid,doctor) values";
			for(int i=0;i<patient.getDoctor().size()-1;i++)
			{
				query2+="(?,?),";
			}
			query2+="(?,?)";
			System.out.println("\n\n"+query2);
			PreparedStatement ps2=con.prepareStatement(query2);
			int index1=1;
			for(int i=0;i<patient.getDoctor().size();i++)
			{
				ps2.setLong(index1++, patient.getPid());
				ps2.setString(index1++, patient.getDoctor().get(i));
			}
			int p2=ps2.executeUpdate();
			System.out.println("patient_doctor entry submitted : "+p2);
			
			
			String query3="insert into patient_disease(pid,disease) values";
			for(int i=0;i<patient.getDisease().size()-1;i++)
			{
				query3+="(?,?),";
			}
			query3+="(?,?)";
			System.out.println("\n\n"+query3);
			PreparedStatement ps3=con.prepareStatement(query3);
			int index3=1;
			for(int i=0;i<patient.getDisease().size();i++)
			{
				ps3.setLong(index3++, patient.getPid());
				ps3.setString(index3++, patient.getDisease().get(i));
			}
			int p3=ps3.executeUpdate();
			System.out.println("patient_disease entry submitted : "+p3);
			System.out.println("\n\neveryThing good......");
			
			return true;
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public ArrayList<Patient> getPatients(int from) 
	{
		ArrayList<Patient>patients=new ArrayList<Patient>();
		
		try 
		{
				Connection con=JdbcConfig.getConnection();
				String query="select pid,name from patient limit "+((from))+",5";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next())
				{
					Patient patient=new Patient();
					patient.setPid(rs.getLong(1));
					patient.setName(rs.getString(2));
					patients.add(patient);
				
				}
				rs.close();
				
				for(int i=0;i<patients.size();i++)
				{
					Patient patient=patients.get(i);
					ArrayList<String>careTeam=new ArrayList<String>();
					String query1="select careteam from patient_careteam where pid="+patient.getPid();
					Statement st1=con.createStatement();
					ResultSet rs1=st1.executeQuery(query1);
					while(rs1.next())
					{
						careTeam.add(rs1.getString(1));
					}
					patient.setCareTeam(careTeam);
				
					ArrayList<String>doctor=new ArrayList<String>();
					String query2="select doctor from patient_doctor where pid="+patient.getPid();
					Statement st2=con.createStatement();
					ResultSet rs2=st2.executeQuery(query2);
					while(rs2.next())
					{
						doctor.add(rs2.getString(1));
					}
					patient.setDoctor(doctor);
				
					ArrayList<String>disease=new ArrayList<String>();
					String query3="select disease from patient_disease where pid="+patient.getPid();
					Statement st3=con.createStatement();
					ResultSet rs3=st3.executeQuery(query3);
					while(rs3.next())
					{
						disease.add(rs3.getString(1));
					}
					patient.setDisease(disease);
					System.out.println("All data fetching done");
					
				}
			return patients;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	public InputStream getImage(Long pid) 
	{
		InputStream image=null;
		try
		{
			Connection con=JdbcConfig.getConnection();
			String query="select image from patient where pid="+pid;
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			int check=1;
			while(rs.next())
			{
				System.out.println(pid+" ki image aa gayi hai "+check+" bar chala");
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
