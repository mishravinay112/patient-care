package org.patientcare.service;

import java.io.InputStream;
import java.util.ArrayList;

import org.patientcare.model.Patient;
import org.patientcare.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService
{
	@Autowired
	PatientRepository patientRepo;
	public boolean savePatient(Patient patient)
	{
		boolean status=patientRepo.savePatient(patient);
		return status;
	}
	public ArrayList<Patient> getPatients(int from)
	{
		ArrayList<Patient>patients=patientRepo.getPatients(from);
		return patients;
	}
	public InputStream getImage(Long pid) 
	{
		InputStream  patientImage=patientRepo.getImage(pid); 
		return patientImage;
	}
}
