package com.example.form;

import javax.validation.constraints.NotBlank;

public class Exam04Form {
	
	@NotBlank(message="必須項目です")
	private String name;
	@NotBlank(message="必須項目です")
	private Integer age;
	@NotBlank(message="必須項目です")
	private String comment;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", comment=" + comment + "]";
	}
	
	

}
