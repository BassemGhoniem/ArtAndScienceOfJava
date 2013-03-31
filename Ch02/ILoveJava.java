/*Programming exercise 1 page 53
 * File: ILoveJava.java
 * ------------------------------
 * 
 */

import java.awt.*;
import acm.program.*;
import acm.graphics.*;

public class ILoveJava extends GraphicsProgram {
	public void run() {
		GLabel label = new GLabel("I Love Java");
		label.setFont("Helvetica-bold-48");
		label.setColor(Color.BLUE);
		add(label,getWidth()/2-label.getWidth()/2,getHeight()/2-label.getAscent()/2);
		GLabel sign = new GLabel("Bassem GHoniem");
		sign.setFont("Helvetica-italic-20");
		sign.setColor(Color.RED);
		add(sign,getWidth()- sign.getWidth()-10,getHeight()-10);
		
		
	}
}

