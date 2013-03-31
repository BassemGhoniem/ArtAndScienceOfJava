import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class Target extends GraphicsProgram{
	public void run(){
		double xc = getWidth()/2;
		double yc = getHeight()/2;
		GOval outerCircle = new GOval(3*72,3*72);
		outerCircle.setFilled(true);
		outerCircle.setColor(Color.RED);
		add(outerCircle,xc-outerCircle.getWidth()/2,yc-outerCircle.getWidth()/2);
		
		GOval midleCircle = new GOval(2*72,2*72);
		midleCircle.setFilled(true);
		midleCircle.setColor(Color.WHITE);
		add(midleCircle,xc-midleCircle.getWidth()/2,yc-midleCircle.getWidth()/2);
		
		GOval innerCircle = new GOval(1*72,1*72);
		innerCircle.setFilled(true);
		innerCircle.setColor(Color.RED);
		add(innerCircle,xc-innerCircle.getWidth()/2,yc-innerCircle.getWidth()/2);
	}

}
