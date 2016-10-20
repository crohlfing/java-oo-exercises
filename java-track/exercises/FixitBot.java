

public class FixitBot extends Robot {

	private String tool;
	//private int armorRating;
	//private int sdc;
	
	public FixitBot (String name, int xpos, int ypos, int speed, int orientation, String tool)
	{
		super(name, xpos, ypos, speed, orientation);
		this.tool = tool;
		this.armorRating = 10;
		this.sdc = 10;
	}
	
	public void fix(BattleBot bot)
	{
		int range = (int)distance(bot);
		if (range < 1) {
			double roll = Math.random();
			int rollNum = (int)((roll * 8) + 1);
			int touch = rollNum + 4;
			bot.sdc = bot.sdc + touch;
			if (bot.sdc > 10) {
				bot.sdc = 10;
			}
			System.out.println("MechBot fixed " + bot.getName() + " for " + touch + " points.  SDC is now " + bot.sdc);
		}
		else if (range == 1) {
			double roll = Math.random();
			int rollNum = (int)((roll * 6) + 1);
			int adj = rollNum + 3;
			bot.sdc = bot.sdc + adj;
			if (bot.sdc > 10) {
				bot.sdc = 10;
			}
			System.out.println("MechBot fixed " + bot.getName() + " for " + adj + " points.  SDC is now " + bot.sdc);

		}
		else if (range < 2) {
			double roll = Math.random();
			int diag = (int)((roll * 6) + 1);
			bot.sdc = bot.sdc + diag;
			if (bot.sdc > 10) {
				bot.sdc = 10;
			}
			System.out.println("MechBot fixed " + bot.getName() + " for " + diag + " points.  SDC is now " + bot.sdc);

		}
		else {
			System.out.println("You need to get closer to fix this robot.");
		}
	}
	
}
