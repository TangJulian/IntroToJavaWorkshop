package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot steve = new Robot();
for (int i = 0; i < 4; i++) {
	

steve.sparkle();
steve.setSpeed(7);
steve.setPenColor(100,0,0);
steve.penDown();
steve.move(150);
	steve.turn(-90);
		steve.move(150);
		steve.turn(-90);
		steve.move(150);
		steve.turn(-90);
		steve.move(150);
		steve.penUp();
	steve.moveTo(300, 550);
	}
}
}
