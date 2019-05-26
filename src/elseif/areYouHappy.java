package elseif;

import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	String name=
	JOptionPane.showInputDialog("Are You happy?");
	if(name.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're "
				+ "doing");}
		if(name.equals("no")) {
			String what= JOptionPane.showInputDialog("Do you want to be happy?");
			if(what.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're "
					+ "doing");}
			
			if(what.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
			}
		}
	}


