package com.lti.client;

import com.lti.model.Flight;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Flight f = new Flight(1001,"mumbai","pune");
//		System.out.println(f.getFlightId());
		
		int num1=10;int num2=20;
		if(add(num1,num2)==30) {
			System.out.println("testpassed");
		
		}
		else {
			System.out.println("test failed");
		}
	}
		
	public static int add(int n1,int n2) {
	 return n1+n2;	
	}
	public static boolean compare(int n1,int n2) {
		if(n1==n2) {
			return true;
		}
		return false;
	}

}
