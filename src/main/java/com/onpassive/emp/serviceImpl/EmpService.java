package com.onpassive.emp.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.onpassive.emp.model.Emp;
import com.onpassive.emp.model.EmpDto;
@Service
public interface EmpService {
	
	public Emp add(Emp emp);

	public List<Emp> findAll();

	public EmpDto findenameandaddress(Integer id);
	public List<EmpDto> findbyNameandAddress();

}
