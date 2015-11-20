package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1
	doubleLength();
    //   Question 2 
	decreaseTurn();
    //   Question 3 
	setNinety();
    //   Question 4 
    //   angleFive (recipe below) 
    //   ------------- Recipe for angleFive 
    //       sets the 5th angle to 36 degrees
	angleFive();
    //   ------------- End of angleFive recipe
  }
private void angleFive() {
	angles.put(5, 36);
}
private void setNinety() {
	angles.put(turn, 90);
}
private void decreaseTurn() {
	turn--;
}
private void doubleLength() {
	length = length * 2;
}
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
