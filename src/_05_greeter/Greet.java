package _05_greeter;

import javax.swing.JOptionPane;

public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name = JOptionPane.showInputDialog("What's your name");
		JOptionPane.showMessageDialog(null,"Hello " + Name);
	}

}
