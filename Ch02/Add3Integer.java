/*
 * Programming exercise 3 page 53
 * File : Add3Integer.java
 * 
 */
import acm.program.*;
public class Add3Integer extends ConsoleProgram {
	public void run(){
		println("This Program adds three integers.");
		int n1 = readInt("n1 : ");
		int n2 = readInt("n2 : ");
		int n3 = readInt("n3 : ");
		int sum = n1 + n2 + n3;
		println("Sum ="+ sum);
	}

}
