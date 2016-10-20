
public class BattleBot extends Robot {

	private String weapon;
	private boolean aiming;
	
	public BattleBot(String name, int xpos, int ypos, int speed, int orientation, String weapon)
	{
		super(name, xpos, ypos, speed, orientation, sdc, armorRating);
		this.weapon = weapon;
		this.aiming = false;
	}
	
	public void attack(BattleBot target)
	{
		int range = (int)distance(target);
		if (this.aiming = true) {
			range = range / 2;
		}
		int mod = range + target.armorRating;
		if (target.isDefending = true) {
			mod = mod - 5;
		}
		int modAR = mod - (int)(target.armorRating / 2);
		double roll = Math.random();
		int rollNum = (int)((roll * 20) + 1);
		if (rollNum > mod) {
			int damage = rollNum - mod;
			target.sdc = target.sdc - damage;
			System.out.println("Your " + this.weapon + " pierced " + target.getName() + 
					"'s armor and did " + damage + " point(s) damage");
		}
		else if (rollNum > modAR)
		{
			int damAR = rollNum - modAR;
			target.armorRating = target.armorRating - damAR;
			System.out.println("Your " + this.weapon + " hit " + target.getName() + 
					"'s armor and did " + damAR + " point(s) damage to its armor");
		}
		else
		{
			System.out.println("You missed");
		}
		this.aiming = false;
		
		
	}
	
	public void aim()
	{
		this.aiming = true;
	}
	
	
}
