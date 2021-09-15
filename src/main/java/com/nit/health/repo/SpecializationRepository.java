package com.nit.health.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.health.entity.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
