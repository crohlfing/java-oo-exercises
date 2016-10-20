
import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu {
	
	private ArrayList<Robot> robots;
	private Scanner s;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		RobotMenu rm = new RobotMenu();
		do {
			x = rm.startMenu();
			rm.processInput(x);						
		} while (x != 6);
	}
	
	public RobotMenu() {
		s = new Scanner(System.in);
		robots = new ArrayList<Robot>();
	}
	
	public int startMenu() {
		System.out.println("Here is the awesome menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		int selection = s.nextInt();
		while(selection < 0 || selection > 6) {
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;		
	}
	
	public void processInput(int selection) {
		if(selection == 1) {
			createRobot();
		}
		else if (selection == 2) {
			displayRobots();
		}
		else if (selection == 3) {
			displayRobots();
			Robot r = selectRobot();
			System.out.println("How many times should " + r.getName() + " move?");
			int moves = s.nextInt();
			while(moves < 1) {
				System.out.println("Try a positive number, wise guy.");
				moves = s.nextInt();
			}
			for(int i = 0; i < moves; i++){
				r.move();
			}
			System.out.println("Done.");
			System.out.println(r);
		}
		else if (selection == 4) {
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Which direction should " + r.getName() + " rotate?");
			int rot = s.nextInt();
			r.rotate(rot);
			System.out.println("Done.");
			System.out.println(r);
		}
		else if (selection == 5) {
			displayRobots();
			Robot r = selectRobot();
			System.out.println("Which robot are we comparing " + r.getName() + " to?");
			displayRobots();
			Robot r2 = selectRobot();
			double dist = r.distance(r2);
			System.out.println(r.getName() + " is " + dist + " units from" + r2.getName());
		}
	}

	private void displayRobots() {
		for(int i = 0; i < robots.size(); i++) {
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot() {
		System.out.println("Select your robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()) {
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection - 1);
	}
	
	private void createRobot() {
		System.out.println("Please enter a name for the robot:");
		String name = s.next();
		System.out.println("Please enter an x position for the robot:");
		int xPos = s.nextInt();
		System.out.println("Please enter an y position for the robot:");
		int yPos = s.nextInt();
		System.out.println("Please enter a speed for the robot:");
		int speed = s.nextInt();
		System.out.println("Please enter an orientation for the robot (north = 1, east = 2, south = 3, west = 4):");
		int orientation = s.nextInt();
		robots.add(new Robot(name, xPos, yPos, speed, orientation));	
	}

	

}

