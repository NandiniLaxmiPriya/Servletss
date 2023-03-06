package com.web.restprac;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Students {
	
	int rollno;
	String sname;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
