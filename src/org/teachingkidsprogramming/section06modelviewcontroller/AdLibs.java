package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    String currentAdverb = MessageBox.askForTextInput("Please enter an adverb.");
    if (currentAdverb.isEmpty())
    {
      MessageBox.showMessage("Don't you want to do adlibs?");
      return;
    }
    else if (currentAdverb.matches("[\\d]*"))
    {
      MessageBox.showMessage("Hello! Numbers are NOT adverbs, try again.");
      return;
    }
    String currentVerb = MessageBox.askForTextInput("Please enter a verb ending in -ed.");
    String currentBodyPart = MessageBox.askForTextInput("Please enter a body part.");
    String currentStory = "Today";
    currentStory = currentStory + "I woke " + currentAdverb + ". ";
    currentStory = currentStory + "Then I " + currentVerb + " ";
    currentStory = currentStory + "my " + currentBodyPart + ". ";
    MessageBox.showMessage(currentStory);
  }
}