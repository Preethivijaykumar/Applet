package applet;
import java.applet.Applet;

import java.awt.Color;

import java.awt.Graphics;

public class Purpleline  extends Applet{

 

	public void paint(Graphics g) {

		Color PURPLE =new Color(255,0,255);
		Color customColor = new Color(10,10,255);
		g.setColor(PURPLE);

		g.drawLine(5,5,30,30);

		
	}
}
