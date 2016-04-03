package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Tester implements TestInterface, TestInterface2 {

	@Override
	public void test() {
		System.out.println("Tester class implementation of test method");
		
	}
	
	public void defaultTest(){
		TestInterface.super.defaultTest();
	}

	public static void main(String[] args) {
		Tester tester = new Tester();
		tester.test();
		tester.defaultTest();
		
		List<String> names = Arrays.asList("Joe", "peter", "mike");
		Collections.sort(names, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				//return b.compareTo(a);
				return b.length() - a.length();
			}
		});
		names.stream().forEach(System.out::println);
		
		Predicate<String> pr = s -> s.length() > 0;
		boolean flag = pr.test("foo");
		boolean f = pr.negate().test("hell");
		System.out.println(flag);
		System.out.println(f);
		
	}

}
