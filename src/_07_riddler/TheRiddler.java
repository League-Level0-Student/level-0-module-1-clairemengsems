package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle = JOptionPane.showInputDialog("Here is a riddle. When Im metal and wood, I bring you home. When Im flesh and blood, in the darkness I roam. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle.equals("bat")){
JOptionPane.showMessageDialog(null, "Yay! You guessed it!" );
score = score + 1;
}else {
JOptionPane.showMessageDialog(null, "Nope, sorry! The answer was a bat. Get it? wink wink nudge nudge");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score was " + score + ".");
	}
}

