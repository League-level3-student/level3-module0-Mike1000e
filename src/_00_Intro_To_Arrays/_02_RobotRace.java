package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args){
        // 2. create an array of 5 robots.
		 Robot[] robotz =new Robot[5];
		Random ran;
		int reach = 500;
        // 3. use a for loop to initialize the robots.
		 for(int i = 0; i < robotz.length ; i++){
			 robotz[i] = new Robot();
			 robotz[i].show();
			 robotz[i].setX(i*120+90);
		 }
        // 4. make each robot start at the bottom of the screen, side by side, facing up
		 
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		
		 while(reach > 0){
		 for(int i = 0; i < robotz.length ; i++){
			 robotz[i].setSpeed(10);
			 ran = new Random();
			 int move = ran.nextInt(50);
			 robotz[i].move(move);
			 if(robotz[i].getY()<=0) {
				 reach=-1;
			 }
		 
		 }
		 }
		 
		
		 for(int i = 0; i < 1000; i++) {
			 for(int d = 0; d < robotz.length ; d++){
				 robotz[d].setSpeed(10);
				robotz[d].turn(2);
				 
			 
			 }
			 
	} 
			 
			 
			 
		 
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
}