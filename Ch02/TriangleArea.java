/*Programming exercise 2 page 53
 * file : TriangleArea.java
 * ----------------------------------
 * this program take the base and height of Triangle and 
 * calculate its area.
 */
import acm.program.*;
public class TriangleArea extends ConsoleProgram {
	public void run(){
		println(" This program Calculate the area of triangle.");
		double base = readDouble("Enter Base: ");
		double height = readDouble("Enter Height: ");
		double a = (base * height) / 2;
		println("Area = " + a);
	}

}
