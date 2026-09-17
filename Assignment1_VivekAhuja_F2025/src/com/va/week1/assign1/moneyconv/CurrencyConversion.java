package com.va.week1.assign1.moneyconv;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CurrencyConversion {
	static Scanner sc = new Scanner(System.in);
	
	static double toCad () {
		double cad, usd;
		System.out.print("Enter currency in USD: ");
		usd = sc.nextDouble();
		cad = usd * 1.40;
		return cad;
	}
	
	static double toUsd() {
		double cad, usd;
		System.out.print("Enter currency in CAD: ");
		cad = sc.nextDouble();
		usd = cad * 0.72;
		return usd;
		
	}
	public void conversion() {
	
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value.. of one currency");
			BigDecimal usd = sc.nextBigDecimal();
			
			BigDecimal usdToCad = new BigDecimal("1.39");
			
			BigDecimal cad = usd.multiply(usdToCad).setScale(2, RoundingMode.HALF_UP);
		
		} catch (Exception e) {
			System.out.println("Oops! Error detected...");
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.hashCode());
		}
		
		
	}
}