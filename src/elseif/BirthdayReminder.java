
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String brothersBirthday = "September 22th";
		String dadsBirthday = "September 21th";
		String myBirthday = "April 9";
String monkey=

		// 2. Find out which birthday the user wants and and store their response in a variable
	JOptionPane.showInputDialog("Whos birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(monkey);
		// 4. if user asked for "brother"
		if(monkey.equals("brother")) {
			JOptionPane.showMessageDialog(null, brothersBirthday);
		}
			//print brother's birthday
		
		// 5. if user asked for "dad"
		else if(monkey.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
			// print dad's birthday
		// 6. if user asked for your name
		else if(monkey.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry I don't remember your birthday");
		}
	} 
}
