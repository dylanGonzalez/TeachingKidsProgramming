package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors.Grays;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class SpiderWeb
{
  public static void main(String[] args)
  {
	Tortoise.setSpeed(10);
	Tortoise.setPenWidth(1);
	Tortoise.setAnimal(Animals.Spider);
	Tortoise.setPenColor(Reds.Red);
	Tortoise.getBackgroundWindow().setBackground(Grays.Black);
	double length = 10.5;
	double zoom = 1.1;
	for (int i = 0; i < 10; i++)
	{
	  length = weaveOneLayer(length, zoom);
	  zoom = zoom * 1.3;
	}
  }

	private static double weaveOneLayer(double length, double zoom)
    {
	  for (int i = 0; i < 6; i++)
	  {	
	    drawTriangle(length);
	    Tortoise.turn(360/6);
	    length = length + zoom;
	  }
	  return length;
    }

	private static void drawTriangle(double length)
	{
	  for (int i = 0; i < 3; i++)
	  {
	    Tortoise.move(length);
	    Tortoise.turn(360/3);
	  }
	}
}
