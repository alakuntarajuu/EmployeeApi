package com.onpassive.emp.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "emp2")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ConstructorBinding
public class Emp 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid2;

	private String ename;

	private String address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Integer eid2, String ename, String address) {
		super();
		this.eid2 = eid2;
		this.ename = ename;
		this.address = address;
	}

	public Integer getEid2() {
		return eid2;
	}

	public void setEid2(Integer eid2) {
		this.eid2 = eid2;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
//	public Emp() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Emp(Integer eid2, String ename, String address) {
//		super();
//		this.eid2 = eid2;
//		this.ename = ename;
//		this.address = address;
//	}
//	public Integer getEid2() {
//		return eid2;
//	}
//	public void setEid2(Integer uid2) {
//		this.eid2 = uid2;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String uname) {
//		this.ename = uname;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public Emp(String uname, String address) {
//		super();
//		this.ename = uname;
//		this.address = address;
//	}	


}
