package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    Tortoise.setX(200);
    drawS();
    drawTriangle();
    drawSquare();
    drawPentagon();
  }
  private static void drawS()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      sCrazy(i);
    }
  }
  private static void drawTriangle()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      triangleCrazy(i);
    }
  }
  private static void drawSquare()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      squareCrazy(i);
    }
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      pentagonCrazy(i);
    }
  }
  private static void sCrazy(int i)
  {
    Tortoise.move(i);
    Tortoise.turn(360.0 / 2);
    Tortoise.turn(1);
  }
  private static void triangleCrazy(int i)
  {
    Tortoise.move(i);
    Tortoise.turn(360.0 / 3);
    Tortoise.turn(1);
  }
  private static void squareCrazy(int i)
  {
    Tortoise.move(i);
    Tortoise.turn(360.0 / 4);
    Tortoise.turn(1);
  }
  private static void pentagonCrazy(int i)
  {
    Tortoise.move(i);
    Tortoise.turn(360.0 / 5);
    Tortoise.turn(1);
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    ColorWheel.addColor(PenColors.Blues.Teal);
    ColorWheel.addColor(PenColors.Purples.Indigo);
  }
}