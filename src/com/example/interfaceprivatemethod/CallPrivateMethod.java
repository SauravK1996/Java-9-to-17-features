package com.example.interfaceprivatemethod;

public class CallPrivateMethod implements PrivateMethodInterface{

	public static void main(String[] args) {
		PrivateMethodInterface privateMethod = new CallPrivateMethod();
		privateMethod.method1();
		
		
		PrivateMethodInterface.method3();
	}

}
