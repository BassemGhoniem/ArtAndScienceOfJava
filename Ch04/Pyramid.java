import java.awt.Color;

import acm.program.*;
import acm.graphics.*;
public class Pyramid extends GraphicsProgram{
	private static final int BRICK_WIDTH = 30;
	private static final int BRICK_HEIGHT = 12;
	private static final int BRICK_IN_BASE = 20;
	private static final int BRICK_SEP = 4;
	public void run(){
		for(int i = 0; i < BRICK_IN_BASE;i++){
			int rowBricks = BRICK_IN_BASE - i;
			int y = (getHeight() + BRICK_HEIGHT * BRICK_IN_BASE + BRICK_IN_BASE * (BRICK_SEP-1))/2  - (i+1) * BRICK_HEIGHT- i * BRICK_SEP;
			
			for(int j = 0;j < rowBricks;j++){
				int x = (getWidth() - rowBricks * BRICK_WIDTH - rowBricks * (BRICK_SEP-1)) / 2 + j * BRICK_WIDTH+ j * BRICK_SEP;
				GRect brick = new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT);
				brick.setFilled(true);
				brick.setFillColor(Color.pink);
				add(brick);
			}
		}
	}
}
