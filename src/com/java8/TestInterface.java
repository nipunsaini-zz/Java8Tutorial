package com.java8;

public interface TestInterface {
	public void test();
	default public void defaultTest(){
		System.out.println("Defult method implementation in interface");
	}
}
