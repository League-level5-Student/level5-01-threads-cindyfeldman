package _01_Olympic_Rings;

import java.awt.Color;
import java.awt.Graphics;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {

	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
public static void main(String[] args) {
makeCircle();


}
private static void makeCircle() {
	Robot one = new Robot();
	Robot two = new Robot();
	Robot three = new Robot();
	Robot four = new Robot();
	Robot five = new Robot();

	one.setSpeed(10);
	one.penDown();
	one.setPenColor(Color.blue);
	one.setX(50);
	one.setY(500);

	Thread t1 = new Thread(()-> {for(int i = 0; i<360;i+=10) {
		one.setAngle(i);
		one.move(20);}});
two.setSpeed(10);
two.penDown();
two.setPenColor(Color.yellow);
two.setX(100);
two.setY(600);
Thread t2 = new Thread(()-> {for(int i = 0; i<360;i+=10) {
	
	two.setAngle(i);
	two.move(20);
}});

three.setSpeed(10);;
three.penDown();
three.setPenColor(Color.black);
three.setX(225);
three.setY(400);
Thread t3 = new Thread(()->  {
for(int i = 0; i<360;i+=10) {
	
	three.setAngle(i);
	three.move(20);
}});
four.setSpeed(10);
four.penDown();
four.setPenColor(Color.green);
four.setX(300);
four.setY(575);
Thread t4 = new Thread(() -> {
for(int i = 0; i<360;i+=10) {
	
	four.setAngle(i);
	four.move(20);
}});
five.setSpeed(10);
five.penDown();
five.setPenColor(Color.red);
five.setX(400);
five.setY(450);
Thread t5 = new Thread(()->{for(int i = 0; i<360;i+=10) {
	
	five.setAngle(i);
	five.move(20);
}});
t1.start();
t2.start();
t3.start();t4.start();t5.start();

}
}

