package com.nit.health.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.health.entity.Specialization;
import com.nit.health.repo.SpecializationRepository;
import com.nit.health.service.ISpecializationService;

public class SpecializationServiceImpl implements ISpecializationService {
	
	@Autowired
	private SpecializationRepository repo;
	
	@Override
	public Long saveSpecialization(Specialization spec) {
		return repo.save(spec).getId();
	}

	@Override
	public List<Specialization> getAllSpecializations() {
		return repo.findAll();
	}

	@Override
	public void removeSpecialization(Long id) {
		repo.deleteById(id);
	}

	@Override
	public void updateSpecialization(Specialization spec) {
		repo.save(spec);
		
	}

	@Override
	public Specialization getOneSpecialization(Long id) {
		Optional<Specialization> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		else
		{
			return null;
		}
	}

}
