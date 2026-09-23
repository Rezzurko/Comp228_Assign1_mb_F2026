package com.va.week1.assign1.moneyconv;
import java.util.Scanner;
/**
 * @author Michael
 * @since 2026-09-17
 * This code is used to convert the currency from CAD to USD in Java!
 */
public class MoneyConv {
	public void cadToUsd() {
		Scanner sc = new Scanner(System.in);
		
		double cad, usd;
		
		System.out.print("Enter the amount of money in CAD: ");
		
		cad = sc.nextDouble();
		
		usd = cad * 0.72;
		
		System.out.println("$" + cad + " CAD to USD is $" + usd + " USD");
		
		sc.close();
	}
}
