package org.teachingkidsprogramming.section01forloops;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    //VirtualProctor.setClassName("Palm STEM Academy");
    //VirtualProctor.setName("Dylan");
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setX(500);
    Tortoise.setY(500);
    int sides = MessageBox.askForNumericalInput("How many sides?");
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenWidth(i);
      Tortoise.setPenColor(PenColors.getRandomColor());
      Tortoise.move(i * 110);
      Tortoise.turn(360 * 3 / 5);
      for (int j = 0; j < args.length; j++)
      {
      }
    }
  }
}
