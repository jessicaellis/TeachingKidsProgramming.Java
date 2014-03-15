package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.ThreadUtils;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    //  startStory (recipe below) --#1
    //   ------------- Recipe for startStory --#1
    startStory();
    //  ------------- End of startStory recipe --#1
  }
  //  startStory (recipe below) --#1
  //   ------------- Recipe for startStory --#1
  //  ------------- End of startStory recipe --#1
  private static void startStory()
  {
    //Tell the user "One morning the Tortoise woke up in a dream."
    MessageBox.showMessage("One morning the Tortoise woke up in a dream.");
    //  animateStartStory (recipe below) --#1
    //   ------------- Recipe for animateStartStory --#1
    animateStartStory();
    //  ------------- End of animateStartStory recipe --#1
    //     Ask the user for their choice of action with the question "Do you want to 'wake up' or 'explore' the dream?"
    String action = MessageBox.askForTextInput("Do you want to 'wake up' or 'explore' the dream?");
    //     If the action is "wake up" --#4
    if ("wake up".equalsIgnoreCase(action))
    {
      //    wakeUp (recipe below) --#1
      //   ------------- Recipe for wakeUp --#1
      wakeUp();
      //      ------------- End of wakeUp recipe --#1
    }
    //Otherwise, if the action is "explore" 
    else if ("explore".equalsIgnoreCase(action))
    {
      //    approachOoze (recipe below) --#1
      //   ------------- Recipe for approachOoze --#1
      approachOoze();
      //      ------------- End of approachOoze recipe --#1
    }
    //Otherwise, if the answer is anything else
    else
    {
      //    badAnswer (recipe below) --#1
      //   ------------- Recipe for badAnswer --#1
      badAnswer();
      //      ------------- End of badAnswer recipe --#1
    }
  }
  private static void badAnswer()
  {
    MessageBox.showMessage("You don't know how to read directions.  You can't play this game.  The End.");
  }
  private static void wakeUp()
  {
    MessageBox.showMessage("You Wake up and have a boring day.  The End.");
  }
  private static void approachOoze()
  {
    String pourTo = MessageBox
        .askForTextInput("You approach a glowing, green bucket of ooze, worried that you will get in trouble, you pick up the bucket.  Do you want to pour it in the 'backyard' or 'toilet'?");
    if ("toilet".equalsIgnoreCase(pourTo))
    {
      pourIntoToilet();
    }
    else if ("backyard".equalsIgnoreCase(pourTo))
    {
      pourIntoBackyard();
    }
    else
    {
      badAnswer();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox
        .showMessage("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String action = MessageBox
        .askForTextInput("As the man starts to prepare you as soup, do you...  'Scream' or 'Faint'");
    if ("faint".equalsIgnoreCase(action))
    {
      tortoiseSoup();
    }
    else if ("scream".equalsIgnoreCase(action))
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
    MessageBox
        .showMessage("As you pour the ooze into the toilet it backs up, gurgles and explodes covering you in radioactive waste.");
    String pourTo = MessageBox.askForTextInput("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'");
    if ("yes".equalsIgnoreCase(pourTo))
    {
      ninjaTortoise();
    }
    else if ("heck yes".equalsIgnoreCase(pourTo))
    {
      ninjaTortoise();
    }
    else
    {
      badAnswer();
    }
  }
  private static void ninjaTortoise()
  {
    MessageBox.showMessage("Awesome Dude!  You live out the rest of your life fighting crimes and eating pizza!");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = Colors.Grays.Black;
    for (int i = 1; i <= 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static Color lighten(Color color)
  {
    int red = increase(color.getRed(), 10);
    int green = increase(color.getGreen(), 10);
    int blue = increase(color.getBlue(), 10);
    return new Color(red, green, blue);
  }
  private static int increase(int amount, int increaseBy)
  {
    return Math.min(255, amount + increaseBy);
  }
}
