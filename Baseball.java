package com.baseballStats;

import java.util.ArrayList;
import java.util.Scanner;

public class Baseball {
//	int[] hiya;

//	private int howManyAtBats = 0;
//	private int atBases = 0;
//	private float safeHits = 0;
	
	
/*	public Baseball(int howManyAtBats, int atBases, float safeHits) 
	{
		this.howManyAtBats = howManyAtBats;
		this.atBases = atBases;
		this.safeHits = safeHits;
	}
	*/
	
	public float sluggingAverage(float totalBases, int numberOfAtBats)
	{
		float slugAvg = (totalBases / (float) numberOfAtBats);
		System.out.printf("%.03f is the slugging average ", slugAvg);
		System.out.println();
		return 	slugAvg;
		
	}
	
	public float battingAverage(float safeHits, int numberOfAtBats)
	{
		float battingAvg = (safeHits / (float) numberOfAtBats);
		System.out.printf("%.03f is the batting average ", battingAvg);
		System.out.println();
		return 	battingAvg;
		
	}
	public String DoSomething()
	{
		float slugAvg = 0;
		int atBases = 0;
		float totalBases = 0;
		float safeHits = 0;
		float battingAvg = 0;
		int playerCount;
		ArrayList Player = new ArrayList();
		Player[] players = new Player[playerCount];
		// how many players
		
		// for (n=1; n  <= playerCount; n++)
		// players[n] = new Player();
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the total number of at-bats the player has taken");
		int numberOfAtBats = scan.nextInt();
		int i = 0;
		while (numberOfAtBats < 0 &&  i < 4 )
		{
			System.out.println("Incorrect entry. Please enter the number of at-bats the player has taken. Please ensure that this is a positive integer.");
			numberOfAtBats = scan.nextInt();
			i++;
		}
		
		System.out.println("The number of bases must be a positive integer 0 to 4");
		
		for (int j = 1;j <= numberOfAtBats; j++)
		{
			System.out.println("At-bat number " + j);
			System.out.print("Please enter the number of bases attained for at-bat number " + j + ": ");
			atBases = scan.nextInt();
			
			while (atBases < 0 || atBases > 4 )
			{
				System.out.println("Incorrect entry. Please enter the number of bases the player has taken. Please ensure that this is a positive integer.");
				atBases = scan.nextInt();
			}
			
			totalBases += atBases;
				if (atBases > 0)
				{
					safeHits++;
				}
			

				
		}  // end of for loop
	
		
		sluggingAverage(totalBases, numberOfAtBats);
		battingAverage(safeHits, numberOfAtBats);

		
		slugAvg = (totalBases / (float) numberOfAtBats);
		battingAvg = (safeHits / (float) numberOfAtBats);
		System.out.printf("%.03f is the slugging average ", slugAvg);
		System.out.println();
		System.out.printf("%.03f is the batting average ", battingAvg);
		System.out.println();

		
		/*
		
		System.out.println("Please enter the Number of singles");

		
		System.out.println("Please enter the Number of doubles");
		
		System.out.println("Please enter the Number of triples");

		System.out.println("Please enter the Number of home runs"); */

		
	//	System.out.println("Please enter the number safe hits of the baseball player");
		return something;

	}
	
	
}  // end of class
