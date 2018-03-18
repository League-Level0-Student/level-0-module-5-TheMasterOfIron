import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
Robot r2d2 = new Robot();
		//2. Set the speed to 100
r2d2.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Color 1","Color 2", "Color 3"}, 0);
		
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		r2d2.setPenColor(colorChoice);
		//4. Ask the use how many polygons they want to be drawn.
		String Polygons = JOptionPane.showInputDialog("How many polygons do you want?");
	int polygons =	Integer.parseInt(Polygons);
		//6. Make it so your shapes do not overlap
	r2d2.hide();
r2d2.penDown();
r2d2.move(100);
		//7. Challenge: add more colors to the Option Dialog.
	}
}