package com.nit.health.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="doctor_tab")
public class Doctor {
	@Id
	@GeneratedValue
	@Column(name="doctor_id_col")
	private Long doctorId;
	@Column(name="doctor_name_col")
	private String doctorName;
	@Column(name="doctor_email_col")
	private String doctorEmail;
	@Column(name="doctor_spec_col")
	private String doctorSpecialization;
	@Column(name="doctor_address_col")
	private String doctorAddress;
	@Column(name="doctor_mobileNo_col")
	private Long doctorMobileNo;
	@Column(name="doctor_gender_col")
	private String doctorGender;
	@Column(name="doctor_note_col")
	private String doctorNote;
	

}
