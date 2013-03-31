import java.awt.Color;

import acm.graphics.*;
import acm.program.*;
public class OlympicRings extends GraphicsProgram{
	public void run(){
		double xc = getWidth()/2;
		double yc = getHeight()/2;
		
		GOval cir1 = new GOval(2*72,2*72);
		cir1.setColor(Color.blue);
		add(cir1,xc-1.5*cir1.getWidth()-10,yc-.5*cir1.getHeight());

		GOval cir2 = new GOval(2*72,2*72);
		cir2.setColor(Color.yellow);
		add(cir2,xc-.5*cir1.getWidth(),yc-.5*cir1.getHeight());

		GOval cir3 = new GOval(2*72,2*72);
		cir3.setColor(Color.BLACK);
		add(cir3,xc+.5*cir1.getWidth()+10,yc-.5*cir1.getHeight());

		GOval cir4 = new GOval(2*72,2*72);
		cir4.setColor(Color.GREEN);
		add(cir4,xc-1.15*cir1.getWidth(),yc+.1*cir1.getHeight());

		GOval cir5 = new GOval(2*72,2*72);
		cir5.setColor(Color.RED);
		add(cir5,xc+.15*cir1.getWidth(),yc+.1*cir1.getHeight());
		
	}
	

}
