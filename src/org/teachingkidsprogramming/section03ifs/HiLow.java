package org.teachingkidsprogramming.section03ifs;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    Random randomGenerator = new Random();
    //int maxGuessValue = MessageBox.askForNumericalInput("Please enter the max number for your guess range : ");
    int maxGuessValue = 0;
    int difficulty = MessageBox.askForNumericalInput("Do you want it to be (1)easy, (2)medium, or (3)hard?");
    //int difficulty = MessageBox.askForTextInput("Do you want it to be (1)'easy', (2)'medium', or (3)'hard'?");
    int easy = 1;
    int medium = 2;
    int hard = 3;
    int tries = 0;
    if (difficulty == easy)
    {
      maxGuessValue = 50;
      tries = 7;
    }
    else if (difficulty == medium)
    {
      maxGuessValue = 250;
      tries = 6;
    }
    else if (difficulty == hard)
    {
      tries = 7;
      maxGuessValue = 500;
    }
    else if (difficulty != 1 || difficulty != 2 || difficulty != 3)
    {
      MessageBox.showMessage("Invalid input");
      System.exit(0);
    }
    int answer = randomGenerator.nextInt(maxGuessValue + 1);
    for (int i = 0; i < tries; i++)
    {
      int guess = MessageBox.askForNumericalInput("Please enter a number between 1- " + maxGuessValue + ": ");
      if (guess == answer)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won!!!");
        MessageBox.showMessage("It took you " + i + " tries.");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Your guess is too high. Try Again.");
      }
      else if (guess < answer)
      {
        MessageBox.showMessage("Your guess is too low. Try Again.");
      }
    }
    MessageBox.showMessage("That was more than " + tries + " guesses!! You Lost!!");
    MessageBox.showMessage("Answer is: " + answer);
  }
}
