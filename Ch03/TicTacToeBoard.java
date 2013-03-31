/*
 * File: TicTacToeBoard.java
 * ---------------------
 * This program solve the programming exercise 3-10 in page 93 
 */

import acm.graphics.*;
import acm.program.*;
public class TicTacToeBoard extends GraphicsProgram {
	private static final int LINE_LENGTH = 150;
	private static final int LINE_SEP = 50;
	
	
	public void run(){
		int xStartHorLines = (getWidth() - LINE_LENGTH) / 2;
		int xEndHorLines = xStartHorLines + LINE_LENGTH;
		int yHorLine1 = (getHeight() - LINE_SEP) / 2;
		int yHorLine2 = (getHeight() + LINE_SEP) / 2;
		add(new GLine(xStartHorLines,yHorLine1,xEndHorLines,yHorLine1));
		add(new GLine(xStartHorLines,yHorLine2,xEndHorLines,yHorLine2));
		
		
		int yStartVerLines = (getHeight() - LINE_LENGTH) / 2;
		int yEndverLines = yStartVerLines + LINE_LENGTH;
		int xverLine1 = (getWidth() - LINE_SEP) / 2;
		int xverLine2 = (getWidth() + LINE_SEP) / 2;
		add(new GLine(xverLine1,yStartVerLines ,xverLine1,yEndverLines));
		add(new GLine(xverLine2,yStartVerLines ,xverLine2,yEndverLines));
		
	}
}
