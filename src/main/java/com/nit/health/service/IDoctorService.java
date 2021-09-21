package com.nit.health.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.health.entity.Doctor;
@Service
public interface IDoctorService {
	
	public Long saveDoctor(Doctor doc);
	public List<Doctor> getAllDoctors();
	public void removeDoctor (Long id);
	public void updateDoctor(Doctor doc);
	public Doctor getOneDoctor(Long id);

}
