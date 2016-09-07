package com.baseballStats;

import java.util.Scanner;

public class Baseball {


	float slugAvg = 0;
	float battingAvg = 0;
	Scanner scan = new Scanner(System.in);
	
	public static void main (String[] args) {

		Scanner scan = new Scanner(System.in);
		int countForPlayerCycle = theNumberOfPlayers();
		
		Player theChosenPlayer = new Player();

		
		for (int x = 0; x < countForPlayerCycle; x++) {
			int atBases = 0;
			float safeHits = 0;
			float totalBases = 0;
			System.out.println("What is the name of the player?");
			theChosenPlayer.setName(scan.nextLine());
			
			System.out.println("Please enter the total number of at-bats the player has taken");
			int numberOfAtBats = scan.nextInt();
			int i = 0;
			while (numberOfAtBats < 0 && i < 4) {
				System.out.println(
						"Incorrect entry. Please enter the number of at-bats the player has taken. Please ensure that this is a positive integer.");
				numberOfAtBats = scan.nextInt();
				i++;
			}
			
			System.out.println("The number of bases must be a positive integer 0 to 4");
			for (int j = 1; j <= numberOfAtBats; j++) {
				System.out.println("At-bat number " + j);
				System.out.print("Please enter the number of bases attained for at-bat number " + j + ": ");
				atBases = scan.nextInt();

				while (atBases < 0 || atBases > 4) {
					System.out.println(
							"Incorrect entry. Please enter the number of bases the player has taken. Please ensure that this is a positive integer.");
					atBases = scan.nextInt();
				}

				totalBases += atBases;
				if (atBases > 0) {
					safeHits++;
				}
			} // end of for loop

		//	sluggingAverage(totalBases, numberOfAtBats);
			theChosenPlayer.setSluggingAverage(sluggingAverage(totalBases, numberOfAtBats));
		//	battingAverage(safeHits, numberOfAtBats);
			theChosenPlayer.setBattingAverage(battingAverage(safeHits, numberOfAtBats));
			System.out.println(theChosenPlayer.toString());
			scan.nextLine();
			System.out.println("\n");
		}  // end of outer for loop
		
		
	}   // end of method main
	
	
	public static float sluggingAverage(float totalBases, int numberOfAtBats)
	{
		float slugAvg = (totalBases / (float) numberOfAtBats);
		System.out.printf("%.03f is the slugging average ", slugAvg);
		System.out.println();
		return 	slugAvg;
		
	}  // end of method sluggingAverage
	
	public static float battingAverage(float safeHits, int numberOfAtBats)
	{
		float battingAvg = (safeHits / (float) numberOfAtBats);
		System.out.printf("%.03f is the batting average \n", battingAvg);
		System.out.println();
		return 	battingAvg;
		
	}   // end of method battingAverage
	
	public static int theNumberOfPlayers()  // used to determine the desired number of times to run a loop 
	{

		int playerCount;
		String checkInput = null;
		Scanner scan = new Scanner(System.in);

		
		// how many players
		System.out.println("For how many baseball players would you like to calculate stats?");
		checkInput = scan.nextLine();
		String regex = "^[a-zA-Z]+$";
			if (checkInput.matches(regex)) {
				System.out.println("Error! Invalid integer value.");
				System.out.println("Please enter the integer value for the number of baseball players that you would like to calculate stats");
				checkInput = scan.nextLine();
			}
			playerCount = Integer.parseInt(checkInput);
	
	return playerCount;
	}  // end of method theNumberOfPlayers
		
		


		/*
		slugAvg = (totalBases / (float) numberOfAtBats);
		battingAvg = (safeHits / (float) numberOfAtBats);
		

		System.out.printf("%.03f is the slugging average ", slugAvg);
		System.out.println();
		System.out.printf("%.03f is the batting average ", battingAvg);
		System.out.println();   */

		
		/*
		
		System.out.println("Please enter the Number of singles");

		
		System.out.println("Please enter the Number of doubles");
		
		System.out.println("Please enter the Number of triples");

		System.out.println("Please enter the Number of home runs"); */

		
	//	System.out.println("Please enter the number safe hits of the baseball player");

	
	
}  // end of class
