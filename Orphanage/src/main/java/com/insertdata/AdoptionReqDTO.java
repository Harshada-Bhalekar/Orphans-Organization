package com.insertdata;

public class AdoptionReqDTO {
	private int Formno;
	public int getFormno() {
		return Formno;
	}
	public void setFormno(int formno) {
		Formno = formno;
	}
	private String MotherName;
	private String FatherName;
	private long MotherMobileNumber;
	private long FatherMobileNumber;
	private String babygender;
	private String AgeGroup;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public long getMotherMobileNumber() {
		return MotherMobileNumber;
	}
	public void setMotherMobileNumber(long motherMobileNumber) {
		MotherMobileNumber = motherMobileNumber;
	}
	public long getFatherMobileNumber() {
		return FatherMobileNumber;
	}
	public void setFatherMobileNumber(long fatherMobileNumber) {
		FatherMobileNumber = fatherMobileNumber;
	}
	public String getBabygender() {
		return babygender;
	}
	public void setBabygender(String babygender) {
		this.babygender = babygender;
	}
	public String getAgeGroup() {
		return AgeGroup;
	}
	public void setAgeGroup(String ageGroup) {
		AgeGroup = ageGroup;
	}
}
