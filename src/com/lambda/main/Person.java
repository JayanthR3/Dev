package com.lambda.main;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	public enum Sex{
		Male,female
	}
	
	
	String name;
	int age;
	String email;
	Sex gender;
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
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public Person(String name, int age, String email, Sex gender) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
	public void printperson() {
		System.out.println(this.toString());
	}
	
	public static List<Person> generateDefaultList(){
		List<Person> people=new ArrayList<>();
		people.add(new Person("abc",25,"abc@gmail.com",Sex.Male));
		people.add(new Person("qwe",35,"qwe@gmail.com",Sex.Male));
		people.add(new Person("plm",20,"plm@gmail.com",Sex.Male));
		
		return people;
	}
	
}
