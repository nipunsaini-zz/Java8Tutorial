package com.java8;

public class Tester implements TestInterface {

	@Override
	public void test() {
		System.out.println("Tester class implementation of test method");
	}

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.test();
		tester.defaultTest();
	}

}
