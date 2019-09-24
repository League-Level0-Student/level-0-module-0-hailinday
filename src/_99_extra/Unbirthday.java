package _99_extra;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String Birthday = JOptionPane.showInputDialog("When is your Birthday?");
	if (Birthday.equals("September 23rd 2050")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
		else {
			JOptionPane.showMessageDialog(null, "Happy unbirthday");
		}
	
}
}
