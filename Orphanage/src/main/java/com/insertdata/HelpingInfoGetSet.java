package com.insertdata;

import java.io.InputStream;

public class HelpingInfoGetSet {
	private String PersonName;
	private long PersonPhoneNumber;
	private String gender;
	private String PersonAddress;
	private String ChildLocation;
	private InputStream PersonAadharphoto;
	private InputStream Policecomplaint;
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public long getPersonPhoneNumber() {
		return PersonPhoneNumber;
	}
	public void setPersonPhoneNumber(long personPhoneNumber) {
		PersonPhoneNumber = personPhoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPersonAddress() {
		return PersonAddress;
	}
	public void setPersonAddress(String personAddress) {
		PersonAddress = personAddress;
	}
	public String getChildLocation() {
		return ChildLocation;
	}
	public void setChildLocation(String childLocation) {
		ChildLocation = childLocation;
	}
	public InputStream getPersonAadharphoto() {
		return PersonAadharphoto;
	}
	public void setPersonAadharphoto(InputStream personAadharphoto) {
		PersonAadharphoto = personAadharphoto;
	}
	public InputStream getPolicecomplaint() {
		return Policecomplaint;
	}
	public void setPolicecomplaint(InputStream policecomplaint) {
		Policecomplaint = policecomplaint;
	}
	
	
}
