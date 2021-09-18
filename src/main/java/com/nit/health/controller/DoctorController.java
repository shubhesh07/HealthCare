package com.nit.health.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.health.entity.Doctor;
import com.nit.health.service.IDoctorService;

@Controller
@RequestMapping("/doc")
public class DoctorController {

	@Autowired
	private IDoctorService service;

	@GetMapping("/register")
	public String displayRegister() {
		return "DoctorRegister";
	}

	@PostMapping("/save")
	public String saveForm(@ModelAttribute Doctor doctor, Model model) {
		Long id = service.saveDoctor(doctor);
		String message = "Record (" + id + ") Inserted";
		model.addAttribute("message", message);
		return "DoctorRegister";
	}

	@GetMapping("/all")
	public String viewAll(
			Model model,
			@RequestParam(value = "message",required = false) String message
			)
	{
		List<Doctor> list = service.getAllDoctors();
		model.addAttribute("list",list);
		model.addAttribute("message", message);
		return "DoctorData";
	}
	  
	  @GetMapping("/delete") public String deleteDoctor(@RequestParam Long
	  doctorId, RedirectAttributes attributes) { service.removeDoctor(doctorId);
	  attributes.addAttribute("message", "Record ("+doctorId+") Deleted"); return
	  "redirect:all"; }
	  
	  @GetMapping("/edit") public String showEditPage(
	  
	  @RequestParam Long id, Model model ) { Doctor doc =
	  service.getOneDoctor(id); model.addAttribute("Doctor", doc);
	  return "DoctorEdit"; }
	  
	 /***
		 * 6. Update Form data and redirect to all
		 */
			  @PostMapping("/update") public String updateData(
			  
			  @ModelAttribute Doctor Doctor, RedirectAttributes attributes
			  ) { service.updateDoctor(Doctor);
			  attributes.addAttribute("message",
			  "Record ("+Doctor.getDoctorId()+") is updated"); return "redirect:all"; }
			 
}
