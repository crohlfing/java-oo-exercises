
public interface RobotBehavior {
	
	public void doNextMove();
	
	public void killRobot(Robot bot); 
		//if (bot.sdc < 1) {
			//remove bot from roster?
		
	}
	
	public void run(int movement) {
		if (movement > 5) {
			System.out.println("You can't move that fast in a single move.");
		}
	}
	
	public void defend();
	
	
	
}
