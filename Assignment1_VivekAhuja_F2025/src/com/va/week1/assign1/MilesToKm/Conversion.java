package com.va.week1.assign1.MilesToKm;
/**
 * @author Michael
 * @since 2026-09-17
 * This code is used to convert miles to kilometers in Java!
 */
import java.util.Scanner;

public class Conversion {

	public void MilesToKm() {
		
		Scanner sc = new Scanner(System.in);
		
		double miles, kilom;
		
		System.out.print("Enter the amount of miles: ");

		miles = sc.nextDouble();
		
		kilom = miles * 1.609;
		
		System.out.println(miles + " miles in kilometeres is " + kilom + " km");
		
		sc.close();
	}

}
