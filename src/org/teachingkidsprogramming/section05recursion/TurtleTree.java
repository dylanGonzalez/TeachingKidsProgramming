package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.PenColors.Browns;
import org.teachingextensions.logo.PenColors.Greens;
import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  public static void main(String[] args) {
	Tortoise.setX(550);
	Tortoise.setY(550);
	for (int i = 0; i < 40; i++) {		
	Tortoise.setSpeed(10);
	Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Black);
	int branch = 60;
    drawBranch(branch);
    Tortoise.turn(9);
  }
}

private static void drawBranch(int branch) {
	if (branch > 0) {
    adjustColor(branch);
    Tortoise.move(branch);
    drawLowerBranches(branch);
	}
}

private static void adjustColor(int branch) {
	HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(5, Greens.LimeGreen);
	colors.put(10, Greens.Lime);
	colors.put(15, Greens.ForestGreen);
	colors.put(20, Greens.DarkGreen);
	colors.put(25, Greens.Olive);
    colors.put(30, Browns.Sienna);
    colors.put(45, Browns.SaddleBrown);
    colors.put(50, Browns.SaddleBrown);
    colors.put(55, Browns.SaddleBrown);
    colors.put(60, Browns.SaddleBrown);
    Tortoise.setPenColor(colors.get(branch));
}

private static void drawLowerBranches(int branch) {
	Tortoise.turn(30);
    drawShorterBranch(branch);
    Tortoise.turn(-60);
    drawShorterBranch(branch);
    Tortoise.turn(30);
    adjustColor(branch);
    Tortoise.move(branch * -1);
}

private static void drawShorterBranch(int branch) {
	drawBranch(branch - 5);
  }
}