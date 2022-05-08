package Question1.Driver;

import java.util.Scanner;

import Question1.Services.Question1Services;

public class Question1Driver {

	public static void main(String[] args) {

		System.out.println("enter the total no of floors in the building");

		Scanner sc = new Scanner(System.in);
		//Read total number of building from user
		int n = sc.nextInt();
		int[] array = new int[n];

		// Reading the size of floors from user
		for (int i = 0; i < n; i++) { 
			System.out.println("enter the floor size given on day :"+(i+1));
			array[i] = sc.nextInt();
			}
		
		//Declaration of Object for Question1Services Class
		Question1Services qs =new Question1Services();
		
		//Calling the SkyScraper method of Question1Services Class
		qs.skyScraperAssembly(n, array);
		
		sc.close();

	}

}
