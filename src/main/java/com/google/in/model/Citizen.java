package com.google.in.model;

import java.time.LocalDate;

public class Citizen {
	    private String name;
	    private LocalDate dob;
	    private String gender;
	    private String ssn;
	    private String stateName;
		public Citizen() {
			super();
			// TODO Auto-generated constructor stub
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		@Override
		public String toString() {
			return "Citizen [name=" + name + ", dob=" + dob + ", gender=" + gender + ", ssn=" + ssn + ", stateName="
					+ stateName + "]";
		}
	    
	    
	    

}
