package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    //
    startStory();
  }
  private static void startStory()
  {
    MessageBox.showMessage("One morning the Tortoise woke up in a dream.");
    //
    //
    animateStartStory();
    //
    int answer = MessageBox.askForNumericalInput("Do you want to wake up(1) or explore(2) the dream?");
    if (answer == 1)
    {
      wakeUp();
    }
    //
    else if (answer == 2)
    {
      approachOoze();
    }
    //
    else
    {
      badAnswer();
    }
    //
    //
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void approachOoze()
  {
    MessageBox.showMessage(
        "You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.");
    int answer2 = MessageBox
        .askForNumericalInput("Do you want to pour the ooze into the backyard(1) or toilet(2)?");
    if (answer2 == 2)
    {
      pourIntoToilet();
    }
    //
    //
    else if (answer2 == 1)
    {
      pourIntoBackyard();
    }
    //
    else
    {
      badAnswer();
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    int answer3 = MessageBox
        .askForNumericalInput("As the man starts to prepare you as soup, do you...  Scream(1) or Faint(2)?");
    if (answer3 == 2)
    {
      tortoiseSoup();
    }
    else if (answer3 == 1)
    {
      startStory();
    }
    else
    {
      badAnswer();
    }
  }
  private static void tortoiseSoup()
  {
    MessageBox.showMessage("You made a delicious soup!  Yum!  The End.");
  }
  private static void pourIntoToilet()
  {
    MessageBox.showMessage(
        "As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radio-active waste.");
    int answer4 = MessageBox.askForNumericalInput("Do you want to train to be a NINJA?  Yes(1) or HECK YES(2)?");
    if (answer4 == 1)
    {
      ninjaTortoise();
    }
    //
    else if (answer4 == 2)
    {
      ninjaTortoise();
    }
    //
    else
    {
      badAnswer();
    }
    //
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You wake up and have a boring day.  The End.");
  }
}
