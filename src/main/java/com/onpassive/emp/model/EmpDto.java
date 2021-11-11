package com.onpassive.emp.model;

public class EmpDto {
	private String ename;
	private String address;
	public EmpDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpDto(String ename, String address) {
		super();
		this.ename = ename;
		this.address = address;
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
	
	
//	public EmpDto() {
//		// TODO Auto-generated constructor stub
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public EmpDto(String ename, String address) {
//		super();
//		this.ename = ename;
//		this.address = address;
//	}
	
	
	

}
