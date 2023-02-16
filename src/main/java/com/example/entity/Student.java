package com.example.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studId;
	private String name;
	private int age;
	private String email;
	public int getStudId() {
		return studId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, name, studId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& studId == other.studId;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}
	public Student() {
		super();
	}
	public Student(int studId, String name, int age, String email) {
		super();
		this.studId = studId;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
