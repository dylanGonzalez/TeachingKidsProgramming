package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(150);
    Tortoise.setY(350);
    int height = 40;
    drawFlatRoof(120);
    drawPointyRoof(150);
    drawSlantyRoof();
    drawStairRoof(height);
    drawDomeRoof();
    drawSpaceNeedle();
  }
  private static void drawSpaceNeedle()
  {
    Tortoise.move(250);
    Tortoise.turn(-80);
    Tortoise.move(20);
    Tortoise.turn(150);
    Tortoise.move(20);
    Tortoise.turn(-45);
    Tortoise.move(15);
    Tortoise.turn(65);
    Tortoise.move(15);
    Tortoise.turn(-90);
    Tortoise.move(30);
    Tortoise.turn(180);
    Tortoise.move(30);
    Tortoise.turn(-90);
    Tortoise.move(15);
    Tortoise.turn(65);
    Tortoise.move(15);
    Tortoise.turn(-45);
    Tortoise.move(20);
    Tortoise.turn(150);
    Tortoise.move(20);
    Tortoise.turn(-80);
    Tortoise.move(250);
  }
  private static void drawSlantyRoof()
  {
    Tortoise.setPenColor(PenColors.Greens.LightGreen);
    Tortoise.move(120);
    Tortoise.turn(45);
    Tortoise.move(40);
    Tortoise.turn(135);
    Tortoise.move(150);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawDomeRoof()
  {
    Tortoise.setPenColor(PenColors.Grays.Gray);
    for (int i = 0; i < 180; i++)
    {
      Tortoise.move(1);
      Tortoise.turn(360 / 360);
    }
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawPointyRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Reds.Red);
    Tortoise.move(height);
    Tortoise.turn(45);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(45);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawStairRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Blues.Blue);
    Tortoise.move(height);
    for (int i = 0; i < 2; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(10);
      Tortoise.turn(-90);
      Tortoise.move(10);
    }
    for (int i = 0; i < 2; i++)
    {
      Tortoise.turn(90);
      Tortoise.move(10);
    }
    for (int i = 0; i < 2; i++)
    {
      Tortoise.turn(-90);
      Tortoise.move(10);
      Tortoise.turn(90);
      Tortoise.move(10);
    }
    Tortoise.move(30);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void drawFlatRoof(int height)
  {
    Tortoise.setPenColor(PenColors.Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
