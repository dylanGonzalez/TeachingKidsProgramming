package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.windows.MessageBox;
import org.teachingkidsprogramming.section03ifs.ConcentricLoop;

public class Password
{
  public static void main(String[] args)
  {
    //Specification - Create a little Message Box application for a login system that checks 
    //for an integer password and limits the number of attempts to enter it before
    //it locks you out (like my phone)
    //what do we need?
    //we need an integer password - variable #1
    int password = MessageBox.askForNumericalInput("What do you want the password to be?");
    if (password == 1)
    {
    }
    // for loop - keep track of how many times user attempted login #2
    for (int i = 0; i < 5; i++)
    {
      // variable to store user's password input #3
      int guess = MessageBox.askForNumericalInput("Whats the password?");
      // check if password is valid statement #4
      if (password == guess)
      {
        // what if user enters correct password? give them a message #5
        // indicating successful login
        MessageBox.showMessage("Correct. Welcome.");
        int project = MessageBox.askForNumericalInput(
            "What do you want to see, (1)Concentric Loop, (2)Digi Flower, or (3)Pentagon Crazy?");
        if (project == 1)
        {
          ConcentricLoop.main(null);
        }
        else if (project == 2)
        {
          DigiFlower.main(null);
        }
        else if (project == 3)
        {
          PentagonCrazy.main(null);
        }
        System.exit(0);
      }
      // what if user enters wrong password but has more attempts available #6
      else if (password != guess)
      {
        int tries = 4 - i;
        //warn user and tell them how many are left
        if (tries > 1)
        {
          MessageBox.showMessage("Invalid input! You have " + tries + " more tries.");
        }
        else if (tries == 1)
        {
          MessageBox.showMessage("Invalid input! You have " + tries + " more try.");
        }
        else
        {
          MessageBox.showMessage("Invalid input! You have no more tries.");
        }
      }
    }
    //what if user uses up their allowed attempts? exit #7
    MessageBox.showMessage("You are being recorded for further evidence.");
  }
}
