/*
 * Programming exercise 4 page 54
 */
import acm.graphics.*;
import acm.program.*;
public class DrawHouse extends GraphicsProgram{
	private static final int HOUSE_HEIGHT = 3 * 72;
	private static final int HOUSE_WEIDTH = 5 * 72;
	private static final int DOOR_HEIGHT = 2 * 72;
	private static final int DOOR_WIDTH = 72;
	private static final int WINDOW_SIDE = 54;
	
	
	public void run(){
		double xc = getWidth()/2;
		double yc = getHeight()/2 ;
		
		GRect house = new GRect(HOUSE_WEIDTH,HOUSE_HEIGHT);
		add(house,xc-house.getWidth()/2,yc-house.getHeight()/2);
		
		GRect door = new GRect(DOOR_WIDTH,DOOR_HEIGHT);
		add(door,xc-DOOR_WIDTH/2,house.getY()+house.getHeight()-door.getHeight());
		
		GRect lWindow = new GRect(WINDOW_SIDE,WINDOW_SIDE);
		GRect rWindow = new GRect(WINDOW_SIDE,WINDOW_SIDE);
		add(lWindow,xc - 2 * HOUSE_WEIDTH/5,yc-HOUSE_HEIGHT/6);
		add(rWindow,xc +HOUSE_WEIDTH/5,yc-HOUSE_HEIGHT/6);
		
		GOval doorKnob = new GOval(DOOR_WIDTH/5,DOOR_WIDTH/5);
		add(doorKnob,xc+doorKnob.getWidth(),yc+doorKnob.getWidth());
		
		GLine line1 = new GLine(house.getX(),house.getY(),getWidth()/2,HOUSE_HEIGHT/6);
		GLine line2 = new GLine(getWidth()/2,HOUSE_HEIGHT/6,house.getX()+HOUSE_WEIDTH,house.getY());
		add(line1);
		add(line2);
	}


	

}
