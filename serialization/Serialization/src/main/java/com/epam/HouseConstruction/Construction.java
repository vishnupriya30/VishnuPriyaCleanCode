package com.epam.HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Construction {

	public static void main(String[] args) {
	    costForConstruction cost = new costForConstruction();
	    cost.readInput();
		PrintStream result =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		result.println("\nTotal Cost of Construction:"+cost.totalCost()+"INR");
		
		// TODO Auto-generated method stub

	}

}
