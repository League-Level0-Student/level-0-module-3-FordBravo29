//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot bob=new Robot();
		for (int i = 0; i < 30; i++) {
			
		}
		//3. Ask the user what color they would like the robot to draw
		String hi =
		JOptionPane.showInputDialog("What color would you like the robot to use?");
		//5. Use an if/else statement to set the pen color that the user requested
if(hi.equals("red")) {
	bob.setPenColor(255, 0, 0);
}
if(hi.equals("green")) {
	bob.setPenColor(0, 255, 0);
}
        //6. If the user doesn’t enter anything, choose a dark color
//already did it!
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of
 bob.hide(); 
 
 
 bob.setSpeed(100); 
 
 
 bob.penDown(); 
 
 for (int i = 0; i < 4; i++) {
	

 bob.move(200);
 
 
 bob.turn(90); 
	}
}
}