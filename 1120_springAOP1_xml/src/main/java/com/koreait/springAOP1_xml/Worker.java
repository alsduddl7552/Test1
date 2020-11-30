package com.koreait.springAOP1_xml;

public class Worker {

	private String name;
	private int age;
	private String job;
	
	public Worker() { }
	public Worker(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
//	Worker 클래스의 핵심 기능
	public void getWorkerInfo() {
		System.out.println("Worker 클래스의 핵심 기능");
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("job : " + job);
		
	}
	
}
