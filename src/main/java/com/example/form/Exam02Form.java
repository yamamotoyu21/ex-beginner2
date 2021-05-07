package com.example.form;

import javax.validation.constraints.NotBlank;

public class Exam02Form {
	
	@NotBlank(message="入力は必須です")
	private Integer num1;
	
	@NotBlank(message="入力は必須です")
	private Integer num2;
	

	

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	

	@Override
	public String toString() {
		return "Exam02Form [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	
	

}
