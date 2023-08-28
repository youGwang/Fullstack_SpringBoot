package com.smhrd.model;

//Full stack 테이블에서 가지고온 학생 데이터를 하나로 묶어 주는 작업
//객체 -> 학생 한명의 데이터를 의미 -> VO(Value Object)
//VO : 필드(테이블 컬럼이름 일치)
public class FullStack {
	private String name;
	private String major;
	private String phone;
	
	//생성자
	public FullStack(String name, String major, String phone) { //DB에서 가지고온 값
		//생성된 FullStack 객체의 필드를 DB에서 가지고온 값으로 초기화
		this.name = name;
		this.major = major;
		this.phone = phone;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
