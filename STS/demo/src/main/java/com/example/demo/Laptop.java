package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap")
public class Laptop {
private int lid;
private String LName;
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", LName=" + LName + "]";
}
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLName() {
	return LName;
}
public void setLName(String lName) {
	LName = lName;
}

public void compile()
{
	System.out.println("Compiling");
}
}
