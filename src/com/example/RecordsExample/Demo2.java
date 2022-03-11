package com.example.RecordsExample;

public class Demo2 {

	public static void basicRecordWithValidation() {
		record Records(String name, int age) {
			Records {
				System.out.println("Name : " + name);
				System.out.println("Age : " + age);

				if (name == null) {
					throw new IllegalArgumentException("Name cannot be null");
				}
			}
		}

		Records record1 = new Records("Akash", 26);
		Records record2 = new Records(null, 26);
	}

	public static void main(String[] args) {
		basicRecordWithValidation();
	}

}
