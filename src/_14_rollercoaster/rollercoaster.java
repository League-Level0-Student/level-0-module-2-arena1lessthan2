package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {

	public static void main(String[] args) {
	
		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int num = Integer.parseInt(height);
		if (num > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the rollercoaster!");
		} else {
			JOptionPane.showMessageDialog(null, "You need to grow more first bitch");
		}
		
		
		
}
}
