package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String birthday  =  JOptionPane.showInputDialog(null, "Is today your birthday??");

		if (birthday.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!!!!!!");
		}else {
		JOptionPane.showMessageDialog(null, "Happy UNbirthday!!!");
			
		}
		
	}
}
