/*File: Fibanacci2.java
 * ---------------------
 * This program solves the programming exercise 4-10 in page 129
 */
import acm.program.*;
public class Fibanacci2 extends ConsoleProgram {
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int t1 = 0;
		int t2 = 1;
		int t3 = t1 + t2;
		println(t1);

		while(t3 < MAX_TERM){
			
			println(t3);
			t3 = t1+t2;
			t1=t2;
			t2=t3;
			
		}
	}
	private static final int MAX_TERM = 10000;

}