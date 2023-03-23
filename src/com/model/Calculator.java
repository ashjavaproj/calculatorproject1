package com.model;

public class Calculator implements workplace{
 public int a;
 public int b;
	@Override
	public void add() {

System.out.println("Addition ="+(a+b));
		
	}

	@Override
	public void sub() {
		
		System.out.println("Subtraction ="+(a-b));

		}

	@Override
	public void mul() {
		System.out.println("Multiplication ="+(a*b));

		
	}

	@Override
	public void div() {
		System.out.println("Division ="+(a/b));

		
	}

}
