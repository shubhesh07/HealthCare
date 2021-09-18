package com.nit.health.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.health.entity.Doctor;
@Service
public interface IDoctorService {
	
	public Long saveDoctor(Doctor doc);
	public void updateDoctor(Doctor doc);
	public void removeDoctor(Long doctorId);
	public List<Doctor> getAllDoctors();
	public Doctor getOneDoctor(Long doctorId);

}
