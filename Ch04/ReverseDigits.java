/*File: DigitalRoot.java
 * ---------------------
 * This program solve the programming exercise 4-6 in page 128
 * this program generates the number that has the same digits of
 * the input number in the reverse order.
 */
import acm.program.*;
public class ReverseDigits extends ConsoleProgram {
	public void run(){
		println("This program reverses the digits in an integer.");
		int num = readInt("Enter a positive integer: ");
		print("The reversed number is ");
		while(num > 0){
			int digit = num % 10;
			print(digit);
			num /= 10;
		}
	}
}
