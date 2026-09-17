package com.va.week1.assign1.Driver;
import com.va.week1.assign1.MilesToKm.Conversion;
import com.va.week1.assign1.LitresToGallons.LitresToGallons;
import com.va.week1.assign1.moneyconv.MoneyConv;

import java.util.Scanner;

import com.va.week1.assign1.GradeCalculation;

/*
@author michael
@since September 17th 2026
This code does conversions based on users request
*/
public class DriverMain {

	public static void main(String[] args) {
		

	/*
	 * Create objects for classes of Task a-d.	
	 * 
	 * 
	 */
		
	// for example tasks grade calculation goes as below..
		GradeCalculation gc = new GradeCalculation();
		Conversion mtk = new Conversion();
		LitresToGallons ltg = new LitresToGallons();
		MoneyConv mc = new MoneyConv();
// create objects for all the classes..  and then call the method using switch case.. 

	System.out.println("Enter the choice for operation  1.-Grade Calculation, 2.-Miles To Kilometeres, 3.-Litres To Gallons, 4.-CAD to USD");
	try (Scanner sc = new Scanner(System.in)) {
		int choice=sc.nextInt();
		
		
		    switch (choice) {
		      case 1:
		    	  System.out.println("Doing Grade Calculation.. ");
		    	  gc.GradeCalc();
		      break;
		      
		      case 2:
		    	  System.out.println("Doing Miles to Kilometeres Conversion..");
		    	  mtk.MilesToKm();
		      break;
		      
		      case 3:
		    	  System.out.println("Doing Litres to Gallons Conversion..");
		    	  ltg.LtoG();
		      break;
		        
		      case 4:
		    	  System.out.println("Doing CAD to USD Conversion..");
		    	  mc.cadToUsd();
		      break;
		    	  
		    }
	}
		
		
		
	
		
	}

}
