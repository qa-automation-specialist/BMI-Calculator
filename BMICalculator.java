package cloudberryday2project;


import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        // Step 1: Get user's weight
	        System.out.print("Enter your weight in kilograms: ");
	        double weight = scanner.nextDouble();

	        // Step 2: Get user's height
	        System.out.print("Enter your height in meters: ");
	        double height = scanner.nextDouble();

	        // Step 3: Calculate BMI
	        double bmi = weight / (height * height);

	        // Step 4: Display BMI value
	        System.out.println("Your BMI is: " + bmi);

	        // Step 5: Display BMI category
	        if (bmi < 18.5) {
	            System.out.println("Category: Underweight");
	        } 
	        else if (bmi >= 18.5 && bmi < 25) {
	            System.out.println("Category: Normal weight");
	        } 
	        else if (bmi >= 25 && bmi < 30) {
	            System.out.println("Category: Overweight");
	        } 
	        else {
	            System.out.println("Category: Obese");
	        }

	        scanner.close();
	    }


	}

