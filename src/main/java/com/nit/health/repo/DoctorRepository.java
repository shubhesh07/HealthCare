package com.nit.health.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.health.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
