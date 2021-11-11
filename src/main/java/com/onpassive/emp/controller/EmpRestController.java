package com.onpassive.emp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onpassive.emp.model.Emp;
import com.onpassive.emp.model.EmpDto;
import com.onpassive.emp.serviceImpl.EmpService;
import com.onpassive.emp.serviceImpl.EmpServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmpRestController {
	@Autowired
	private EmpServiceImpl empservice;
	

	@PostMapping("/add")
	public Emp add(@RequestBody Emp emp) {
		
		return empservice.add(emp);
	}


	@GetMapping("/findAll")
	public List<Emp> findAll() {
		return empservice.findAll();
	}
	
	@GetMapping("/findbyNameandAddress")
	public List<EmpDto>findbyNameandAddress(){
		return empservice.findbyNameandAddress();
	}


}
