package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String andrew = "loud.";
String eric = "intresting.....";
String bob = "cool.";
String anna = "nice.";
		// 2. Ask the user to enter a name. Store their answer in a variable.

String input = JOptionPane.showInputDialog("Whats your name? (choose out of andrew, eric, bob, or anna.)");

		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (input.equals("andrew")){
JOptionPane.showMessageDialog(null, "You are " + andrew);
}

if (input.equals("eric")){
JOptionPane.showMessageDialog(null, "You are " + eric);
}

if (input.equals("bob")){
JOptionPane.showMessageDialog(null, "You are " + bob);
}

if (input.equals("anna")){
JOptionPane.showMessageDialog(null, "You are " + anna);
}























	}
}

