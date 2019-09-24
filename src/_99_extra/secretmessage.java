package _99_extra;

import javax.swing.JOptionPane;

public class secretmessage {
public static void main(String[] args) {
	String Password = ("1234");
	String Secret = JOptionPane.showInputDialog("Ask a secret message");
	String Yeet = JOptionPane.showInputDialog("If you can guess the password I will show you the secret password");
	if (Yeet.equals(Password)) {
		JOptionPane.showMessageDialog(null, Secret);
	}
	else {
		JOptionPane.showMessageDialog(null, "Intruder");
	}
}
}
