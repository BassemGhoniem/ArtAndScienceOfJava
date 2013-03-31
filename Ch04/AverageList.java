/*
 * File: AverageList.java
 * ---------------------
 * This program solve the programming exercise 4-5 in page 128 
 * This program reads in a list of integers representing exam scores and prints out the average
 */
import acm.program.*;
public class AverageList extends ConsoleProgram {
	private static final int SENTINEL = -1;

	public void run(){
		println("This program reads in a list of integers representing exam scores and prints out the average");
		println("To finish entering the scores type " + SENTINEL);
		int sum = 0;
		int count = 0;
	
		//loop and half to keep counter of the scores and compute the sum of them 
		while(true){
			int score;
			//loop and half to avoid the negative numbers as scores
			while(true){
				score = readInt("?");
				if(score >= SENTINEL)break;
				println("there's no negative score.");
			}
			if(score == SENTINEL)break;
			sum += score;
			count++;			
		}
		
		//if-else statement to avoid the division by zero in the case if the user enter just the sentinel. 
		if(count != 0){
			double average = (double)sum / count;
			println("The average of scores = " + average);
		}else{
			println("you didn't enter the scores");
		}
	}
}
