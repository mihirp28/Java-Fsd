package com.stackroute.wipro.ThePublishingFirm_Autowiring;

public class Author {
	private String name;
	private int age;
	public Author() {
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
	@Override
	public String toString() {
		return "Book [name=" + name + ", age=" + age + "]";
	}

}
