import acm.program.ConsoleProgram;
public class Fibanacci2 extends ConsoleProgram {
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int x=0;
		println(x);
		int y=1;
		int z=x+y;
		while(z < 10000){
			println(z);
			z = x+y;
			x=y;
			y=z;
			
		}
	}

}