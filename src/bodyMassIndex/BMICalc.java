package bodyMassIndex;

import java.util.Scanner;

public class BMICalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your weight in KG: ");
		double weight = scanner.nextDouble();
		System.out.println("Input your height in Meters: ");
		double height = scanner.nextDouble();
		double BMI = weight / (height * height);
		System.out.println("The Body Mass Index (BMI) is " + BMI + " kg/m2");
		scanner.close();
	}
}
