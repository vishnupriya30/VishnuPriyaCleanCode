package com.epam.Serialization;

import java.io.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Interest interest = new Interest();
    	String filename = "ResultInterest.ser"; 
    	Scanner read = new Scanner(System.in);
    	System.out.print("Enter the pricipal Amount:");
        double principleAmount = read.nextDouble();
        System.out.print("\nEnter the duration in years:");
        int time = read.nextInt();
        System.out.print("\nEnter the rate of interest:");
        double rate = read.nextDouble();
        System.out.print("\nEnter the no of times compounded:");
        int compoundTimes = read.nextInt();
        try
        {    
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file);  
            out.writeObject(interest);
            PrintStream result =  new PrintStream(new FileOutputStream(FileDescriptor.out));
            result.println("\nCompoundInterest:"+interest.compoundInterest(principleAmount,time,rate,compoundTimes));
            result.println("SimpleInterest:"+interest.simpleInterest(principleAmount,time,rate));
            out.close(); 
            file.close(); 
            System.out.println("Object has been serialized"); 
  
        }
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
    }
}
