/*
 * File: NurseryRyhme.java
 * ---------------------
 * This program solve the programming exercise 3-9 in page 93 
 */
import acm.program.*;
public class NurseryRyhme extends ConsoleProgram{
	private static final int N_WIVES = 7;
	private static final int N_SACKS = 7;
	private static final int N_CATS = 7;
	private static final int N_KITS = 7;
	public void run(){
		println("This program solve the following trick:");
		println();
		println("As I was goning to St. Ives,");
		println("I met a man with seven wives,");
		println("Each wife had seven sacks,");
		println("Each sack had seven cats,");
		println("Each cat had seven kits,");
		println("Kits, cats, sacks, and wives,");
		println("How many were going to St. Ives?");
	
		int totalSacks = N_SACKS * N_WIVES;
		int totalCats = N_CATS * totalSacks;
		int totalKits = N_KITS * totalCats;			
		int total = 1 + N_WIVES + totalSacks + totalCats + totalKits;
		println();
		println( + total + " were going to St. Ives.");
		}
}
