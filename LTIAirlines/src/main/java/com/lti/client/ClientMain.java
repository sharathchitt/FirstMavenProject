package com.lti.client;

import com.lti.model.Flight;

public class ClientMain {

	public static void main(String[] args) {
//		Flight flight = new Flight(1001, "BLR", "MAA");
//		System.out.println(flight.getFlightID()+ " " + flight.getSource()+ " "+flight.getDestination());
		
		//Test data
		int num1=10;int num2=20;
		//add(num1, num2)   :  returned output
		//30                :  expected 
		if(add(num1, num2)==30)
			System.out.println("Test passed.");
		else
			System.out.println("Test failed.");

	}
	
	//These are some implemented logic on the data above
	
	//This logic is later checked using JUnit
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
	//This logic is later checked using JUnit
	public static boolean compareNums(int n1, int n2) {
		if(n1==n2)
			return true;
		else
			return false;
	}

}
