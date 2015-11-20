package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.PenColors.Oranges;
import org.teachingextensions.logo.PenColors.Pinks;
import org.teachingextensions.logo.PenColors.Reds;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
	  Tortoise.setSpeed(10);
	createColorPalette();
	for (int i = 0; i < 30; i++) {
	Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
	drawOctogonWithOverlap();
	Tortoise.turn(360/30);
	Tortoise.turn(5);
	}
  }

private static void drawOctogonWithOverlap() {
	for (int i = 0; i < 8 + 1; i++) {
		
	  Tortoise.move(110);
	  Tortoise.turn(360/8);
	  }
}

private static void createColorPalette() {
	ColorWheel.addColor(Pinks.HotPink);
	ColorWheel.addColor(Reds.Red);
	ColorWheel.addColor(Pinks.Fuchsia);
	ColorWheel.addColor(Oranges.Orange);
	ColorWheel.addColor(Pinks.DeepPink);
	ColorWheel.addColor(Reds.MediumVioletRed);
	ColorWheel.addColor(Reds.Crimson);
	ColorWheel.addColor(Reds.Tomato);
  }
}
