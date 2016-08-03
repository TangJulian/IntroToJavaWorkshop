package day5;

import javax.swing.JOptionPane;

public class Snooper {

	public static void main(String[] args) {
		String yesno = JOptionPane.showInputDialog(null,
				"Would you like to enter a givaway to win $1,000,000? yes or no");
		if (yesno.equals("yes")) {
			JOptionPane.showInputDialog("All you have to do is enter your credit card number here!");
			JOptionPane.showMessageDialog(null,
					"Thank you for entering this givaway. The winner will be chosen in one week.");
		}
		if (yesno.equals("no")) {
			JOptionPane.showInputDialog(
					"a virus has been detected on your device. To get rid of it enter your credit card number");
			JOptionPane.showMessageDialog(null, "The virus has been deystroyed");
		}

	}
}
