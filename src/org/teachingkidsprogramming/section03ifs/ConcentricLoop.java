package org.teachingkidsprogramming.section03ifs;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class ConcentricLoop
{
  public static void main(String[] args)
  {
    ColorWheel.addColor(PenColors.Reds.Red);
    ColorWheel.addColor(PenColors.Blues.Blue);
    ColorWheel.addColor(PenColors.Greens.Green);
    ColorWheel.addColor(PenColors.Yellows.Yellow);
    ColorWheel.addColor(PenColors.Oranges.Orange);
    ColorWheel.addColor(PenColors.Purples.Purple);
    Tortoise.setX(150);
    Tortoise.setY(200);
    Tortoise.setSpeed(10);
    for (int i = 0; i < 360; i++)
    {
      Tortoise.move(3);
      Tortoise.turn(1);
      if (i % 20 == 0)
      {
        for (int j = 0; j < 360; j++)
        {
          Tortoise.setPenColor(ColorWheel.getNextColor());
          Tortoise.move(1);
          Tortoise.turn(1);
          Tortoise.setPenWidth(1);
        }
      }
    }
    //    Tortoise.turn(180);
    //    for (int i = 0; i < 360; i++)
    //    {
    //      Tortoise.move(3);
    //      Tortoise.turn(1);
    //      if (i % 20 == 0)
    //      {
    //      }
    //      for (int j = 0; j < 360; j++)
    //      {
    //        Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Tortoise.move(1);
    //        Tortoise.turn(1);
    //        Tortoise.setPenWidth(1);
    //      }
    //    }
  }
}