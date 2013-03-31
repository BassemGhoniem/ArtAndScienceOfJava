/*
 * File: DigitalRoot.java
 * ---------------------
 * This program solve the programming exercise 4-7 in page 128
 * the digital root of an integer n is defined as the result of
 * summing the digits repeatedly until only a single digit remains
 * this program calculates the digital root of the input value. 
 */
import acm.program.*;
public class DigitalRoot extends ConsoleProgram{
	public void run(){
		int num = readInt("Enter a positive integer: ");
		int sum=num;
		while(sum>=10){
			sum = 0;
			while(num > 0){
				int digit = num % 10;
				sum += digit;
				num /= 10;
			}
			num = sum;
		}
		println("The digital root is " + sum);
	}
}
