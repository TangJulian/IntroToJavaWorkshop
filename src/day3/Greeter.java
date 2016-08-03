package day3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("What's your name?");

		JOptionPane.showMessageDialog(null, "Hi! " + answer + " is a cool name");

		JOptionPane.showInputDialog("What is your favorite game?");

		JOptionPane.showMessageDialog(null, "Cool! I play that too");
	}
}
