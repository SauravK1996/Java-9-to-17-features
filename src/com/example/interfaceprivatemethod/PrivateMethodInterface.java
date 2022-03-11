package com.example.interfaceprivatemethod;

public interface PrivateMethodInterface {
	default void method1() {
		System.out.println("Hello method1...");
		method2();
	}
	
	private void method2() {
		System.out.println("Hello private method2...");
	}
	
	static void method3() {
		System.out.println("Hello method3...");
		method4();
	}
	
	private static void method4() {
		System.out.println("Hello static private method4...");
	}
}
