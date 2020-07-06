package br.com.amsj.aws.dto;

import java.io.Serializable;

public class UserDtoInput implements Serializable {
	
	private static final long serialVersionUID = -653773687134051542L;
	
	private String firstName;
	private String surname;
	private Integer age;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
