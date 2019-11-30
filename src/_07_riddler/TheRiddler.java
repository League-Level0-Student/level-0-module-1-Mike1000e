package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0 ;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 =	JOptionPane.showInputDialog(null,"What has an eye and can not see???");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (riddle1.equalsIgnoreCase("A needle")) {
			JOptionPane.showMessageDialog(null, "Correct!!!");
			score ++;
		}else {
			JOptionPane.showMessageDialog(null, "Nope. The anwser is a needle.");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
			String riddle2 =	JOptionPane.showInputDialog(null,"What gets wetter and wetter the more it dries.");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (riddle2.equalsIgnoreCase("A towel")) {
				JOptionPane.showMessageDialog(null, "Correct!!!");
				score ++;
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, the anwser is a towel.");
			}
			String riddle3 =	JOptionPane.showInputDialog(null,"What has a head and a tail, but no body?");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (riddle3.equalsIgnoreCase("A coin")) {
				JOptionPane.showMessageDialog(null, "Correct!!!");
				score ++;
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, the anwser is a coin.");
			}
			String riddle4 =	JOptionPane.showInputDialog(null,"What is made of water but if you put it into water it will die?");
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (riddle4.equalsIgnoreCase("Ice")) {
				JOptionPane.showMessageDialog(null, "Correct!!!");
				score ++;
			}else {
				JOptionPane.showMessageDialog(null, "Sorry, the anwser is ice.");}
			
				String riddle5 =	JOptionPane.showInputDialog(null,"I'm tall when I'm young and I'm short when I'm old. What am I?");
			
				// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if (riddle5.equalsIgnoreCase("A candle")) {
					JOptionPane.showMessageDialog(null, "Correct!!!");
					score ++;
				}else {
					JOptionPane.showMessageDialog(null, "Sorry, the anwser is a candle.");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "You got " + score + "/5");
	}
}}

