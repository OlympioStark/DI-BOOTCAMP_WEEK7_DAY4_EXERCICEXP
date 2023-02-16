package Exercice3;

import java.util.Random;
import java.util.Scanner;

public class NumbersGenerators {
	
	public static void genrateNumber() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter a number X :");
		int x = scanner.nextInt();
		
		System.out.println("Please, enter a number N :");
		int n = scanner.nextInt();
		
		//Generate n random numbers
		System.out.println("=========== Random Numbers =============");
		Random random = new Random();
		for (int index = 0; index < n; index++) {
			int r = random.nextInt(1, x +1);
			System.out.println(r);
		}
	}

	public static void main(String[] args) {
		genrateNumber();
	}

}
