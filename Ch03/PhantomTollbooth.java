/*
 * File: PhantomTollbooth.java
 * ---------------------
 * This program solve the programming exercise 3-6 in page 92 
 */

import acm.program.*;

public class PhantomTollbooth extends ConsoleProgram {
	public void run() {
		println("This program correct the Milo's calculations using Java's precedence rules.");
		println("Milo needs evaluate: 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5");
		int miloCal = (((((((((((((((((4 + 9) - 2) * 16) + 1) / 3) * 6) - 67) + 8) * 2) - 3) + 26) - 1) / 34) + 3) / 7) + 2) - 5);
		int javaCal = 4 + 9 - 2 * 16 + 1 / 3 * 6 - 67 + 8 * 2 - 3 + 26 - 1 / 34 + 3 / 7 + 2 - 5;
		println("Milo's calculations result: " + miloCal );
		println("Java's calculations result: " + javaCal );
	}
}

