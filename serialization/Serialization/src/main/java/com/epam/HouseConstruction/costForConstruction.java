package com.epam.HouseConstruction;

import java.util.Scanner;

public class costForConstruction {
	int materialType;
	int costPerSquareFeet = 0;
	int totalArea;
	public void readInput(){
		Scanner read = new Scanner(System.in);
		System.out.println("Press 1 for 'Standard Materials'\nPress 2 for 'Above Standard Materials'\nPress 3 for High Standard Materials");
		materialType = read.nextInt();
		System.out.println("Enter total area of your house");
		totalArea = read.nextInt();
		switch(materialType){
		case 1:
			costPerSquareFeet = 1200;
			break;
		case 2:
			costPerSquareFeet = 1500;
			break;
		case 3:
			System.out.print("Press y if you require automated home else press n:");
			char automatedOption = read.next().charAt(0);
			if(automatedOption == 'n'){
				costPerSquareFeet = 1800;
			}
			else {
				costPerSquareFeet = 2500;
			}
			break;
		default : System.out.println("Press a valid option");
		}
	}
	public int totalCost(){
		return costPerSquareFeet*totalArea;
	}

}
