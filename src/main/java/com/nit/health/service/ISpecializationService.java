package com.nit.health.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nit.health.entity.Specialization;

@Service
public interface ISpecializationService {
	
	public Long saveSpecialization(Specialization spec);
	public List<Specialization> getAllSpecializations();
	public void removeSpecialization (Long id);
	public void updateSpecialization(Specialization spec);
	public Specialization getOneSpecialization(Long id);
	public boolean isSpecCodeExist(String specCode); 
	/*
	 * public boolean isSpecNameExist(String specName);
	 */
}
