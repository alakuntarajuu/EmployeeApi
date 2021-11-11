package com.onpassive.emp.serviceImpl;

import java.util.List;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpassive.emp.model.Emp;
import com.onpassive.emp.model.EmpDto;
import com.onpassive.emp.repo.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepository empRepo;

	@Override
	public Emp add(Emp emp) {

		return empRepo.save(emp);
	}


	@Override
	public List<Emp> findAll() {
		return empRepo.findAll();
	}

	@Override
	public EmpDto findenameandaddress(Integer id) {
		Emp user = empRepo.findById(id).get();
		EmpDto dto =new EmpDto();
		dto.setEname(user.getEname());
		dto.setAddress(user.getAddress());
		return dto  ;
	}

	@Override
	public List<EmpDto> findbyNameandAddress() {
		// TODO Auto-generated method stub
		return empRepo.findbyNameandAddress();
	}

	}
