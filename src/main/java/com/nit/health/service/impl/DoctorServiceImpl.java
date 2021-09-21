package com.nit.health.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.health.entity.Doctor;
import com.nit.health.repo.DoctorRepository;
import com.nit.health.service.IDoctorService;
@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private DoctorRepository repo;
	
	@Override
	public Long saveDoctor(Doctor doc) {
		return repo.save(doc).getId();
	}

	@Override
	public void updateDoctor(Doctor doc) {
		repo.save(doc);

	}

	@Override
	public void removeDoctor(Long doctorId) {
		repo.deleteById(doctorId);

	}

	@Override
	public List<Doctor> getAllDoctors() {
		
		return repo.findAll();
	}

	@Override
	public Doctor getOneDoctor(Long doctorId) {
		Optional<Doctor> optional=repo.findById(doctorId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else
		{
			return null;
		}
	}

}
