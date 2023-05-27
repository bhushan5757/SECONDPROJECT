package com.hibernate;

public class Student {
	private int id;
private String name;
private String city;
private int std;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", std=" + std + "]";
}



}
