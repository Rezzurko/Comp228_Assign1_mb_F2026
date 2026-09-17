package com.va.week1.assign1.LitresToGallons;

import java.util.Scanner;

public class LitresToGallons {
	
	public void LtoG () {
		
		Scanner sc = new Scanner(System.in);
		
		double litres, gallons;
		
		System.out.print("Enter the amount of litres: ");
		
		litres = sc.nextDouble();
		
		gallons = litres * 0.264172;
	
		System.out.println(litres + " litres in gallons is " + gallons + " gallons"); 
		
		sc.close();
	}
}
