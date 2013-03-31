import acm.program.*;
public class Fibonacci extends ConsoleProgram {
	public void run(){
		println("This program lists the Fibonacci sequence.");
		int x=0;
		int y=1;
		for(int i = 0;i <= 16;i++){
			if(i > 1){
				int z = x+y;
				println(z);
				x=y;
				y=z;
			}else if(i == 0){
				println(x);
			}else if(i == 1){
				println(y);
			}
		}
	}

}
