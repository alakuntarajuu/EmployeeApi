package com.onpassive.emp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.onpassive.emp.model.Emp;
import com.onpassive.emp.model.EmpDto;
@Repository
public interface EmpRepository extends JpaRepositoryImplementation<Emp, Integer> {

	@Query(value="select new com.onpassive.emp.model.EmpDto(e.ename,e.address) from Emp e")
	List<EmpDto> findbyNameandAddress();
	
	
}
