import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class Rainbow extends GraphicsProgram{
	public void run(){
		
		GOval cir1 = new GOval(2*getHeight(),2*getHeight());
		cir1.setFilled(true);
		cir1.setColor(Color.RED);
		add(cir1,getWidth()/2-cir1.getWidth()/2,0);
		
		GOval cir2 = new GOval(2*getHeight()-30,2*getHeight()-30);
		cir2.setFilled(true);
		cir2.setColor(Color.orange);
		add(cir2,getWidth()/2-cir2.getWidth()/2,30);
		
		GOval cir3 = new GOval(2*getHeight()-60,2*getHeight()-60);
		cir3.setFilled(true);
		cir3.setColor(Color.yellow);
		add(cir3,getWidth()/2-cir3.getWidth()/2,60);
		
		GOval cir4 = new GOval(2*getHeight()-90,2*getHeight()-90);
		cir4.setFilled(true);
		cir4.setColor(Color.green);
		add(cir4,getWidth()/2-cir4.getWidth()/2,90);
		
		GOval cir5 = new GOval(2*getHeight()-120,2*getHeight()-120);
		cir5.setFilled(true);
		cir5.setColor(Color.blue);
		add(cir5,getWidth()/2-cir5.getWidth()/2,120);
		
		GOval cir6 = new GOval(2*getHeight()-150,2*getHeight()-150);
		cir6.setFilled(true);
		cir6.setColor(Color.magenta);
		add(cir6,getWidth()/2-cir6.getWidth()/2,150);
		
		GOval cir7 = new GOval(2*getHeight()-180,2*getHeight()-180);
		cir7.setFilled(true);
		cir7.setColor(Color.cyan);
		add(cir7,getWidth()/2-cir7.getWidth()/2,180);
		
		setBackground(Color.cyan);
	}
}
