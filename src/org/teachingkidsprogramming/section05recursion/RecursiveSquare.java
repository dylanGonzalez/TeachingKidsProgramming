package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class RecursiveSquare
{
  public static void main(String[] args) throws Exception
  {
	Tortoise.setX(350);
	Tortoise.setY(350);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Greens.DarkGreen);
    Tortoise.setPenColor(PenColors.Yellows.Gold);
    Tortoise.setSpeed(10);
    double length = 150.0;
    for (int i = 0; i < 4; i++)
    {
    makeASquare(length);
    Tortoise.turn(90);
    Tortoise.move(300);
    }
  }

private static void makeASquare(double length) {
	if (length > 10)
	{
      moveToTheSquareStart(length);
      for (int i = 0; i < 4; i++)
      {
        Tortoise.move(length);
        makeASquare(length/1.7);
        if (i < 3)
        {
          Tortoise.turn(90);
        }
    }
    moveBackToCenter(length);
    length = length * 2;
    }
}

private static void moveBackToCenter(double length) {
	Tortoise.setPenUp();
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(90);
    Tortoise.move(length / 2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
}

private static void moveToTheSquareStart(double length) {
	Tortoise.setPenUp();
    Tortoise.move(length/2);
    Tortoise.turn(-90);
    Tortoise.move(length/2);
    Tortoise.turn(180);
    Tortoise.setPenDown();
}
}
