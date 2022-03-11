package com.example.RecordsExample;

public class Demo {
	public static void main(String[] args) {
		Student s1 = new Student("Akash", 25);
		Student s2 = new Student("Aman", 26);

		System.out.println(s1.getName());
		System.out.println(s2.getAge());

		System.out.println(s1.equals(s2));

		Records r1 = new Records("Akash", 25);
		Records r2 = new Records("Aman", 25);

		System.out.println(r1.age());
		System.out.println(r1.equals(r2));
	}
}
