package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot joe = new Robot();

		joe.hide();

		joe.penDown();

		joe.setSpeed(10);

		for (int i = 0; i < 99999999; i++) {

			joe.setRandomPenColor();

			joe.move(i);

			joe.turn(360 / 7);

			joe.setPenWidth(i);
		}
	}
}