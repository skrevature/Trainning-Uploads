package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuselect = 0;
		while (menuselect != 4) {
			System.out.println("Please make a selection:");
			System.out.println("1. Feet to Centimeters");
			System.out.println("2. Cups to US Gallons");
			System.out.println("3. Kilograms to Pounds");
			System.out.println("4. Quit");
			
			Scanner myScanner = new Scanner(System.in);
			menuselect = myScanner.nextInt();	
			switch (menuselect) {
			case 1:
				System.out.println("How many Feet?");
				Scanner inputFeet = new Scanner(System.in);
				double feet = inputFeet.nextDouble();
				double centi = 30.48 * feet;
				System.out.println(feet + " ft = " + centi + " cm");
				break;
			case 2:
				System.out.println("How many Cups?");
				Scanner inputCups = new Scanner(System.in);
				double cups = inputCups.nextDouble();
				double gal = 0.0625 * cups;
				System.out.println(cups + " cups = " + gal + " gal");
				break;
			case 3:
				System.out.println("How many Kilograms?");
				Scanner inputKilograms = new Scanner(System.in);
				double kilograms = inputKilograms.nextDouble();
				double lbs = 2.205 * kilograms;
				System.out.println(kilograms + " kg = " + lbs + " lbs");
				break;
			case 4:
				System.out.println("You have finished converting.");
				break;
			default:
				System.out.println("Please select a valid option.");
			}
		}
	}
}
