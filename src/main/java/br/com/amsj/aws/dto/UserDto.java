package br.com.amsj.aws.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 3996516755045584457L;
	
	String name;
	String surname;
	String detail;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}
