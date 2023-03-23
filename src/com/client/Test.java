package com.client;

import java.util.Scanner;

import com.model.Calculator;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator c=new Calculator();
		System.out.println("Enter any 2 No  ");
		System.out.print(" value A = ");
		c.a=sc.nextInt();
		System.out.print(" Value B = ");
		c.b=sc.nextInt();
		System.out.println();
		while(true)
		{   
			System.out.println("****Calculator******* ");
			System.out.println("Enter 1 for Add");	
			System.out.println("Enter 2 for Sub");
			System.out.println("Enter 3 for Mul");
			System.out.println("Enter 4 for Div");
			System.out.println("Enter 5 for Exit");
			System.out.println();
			System.out.print("Enter any case = ");
			int no=sc.nextInt();
			switch(no)
			{
			case 1:
				c.add();
				break;
				
			case 2:
				c.sub();
				break;
				
			
			case 3:
				c.mul();
				break;
				
			
			case 4:
				c.div();
				break;
				
			
			case 5:
				System.exit(0);
				break;
				
			default :
				System.out.println("Enter valid case");
		}
		}
		}
		}
