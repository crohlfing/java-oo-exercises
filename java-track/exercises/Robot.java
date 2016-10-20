public class Robot {

		private String name;
		private int xpos;
		private int ypos;
		private int speed;
		private int orientation;
		protected int sdc;
		protected int armorRating;
		protected boolean isDefending;
		
		public Robot(String name, int xpos, int ypos, int speed, int orientation)
		{
			this.name = name;
			this.xpos = xpos;
			this.ypos = ypos;
			this.speed = speed;
			this.orientation = orientation;
			this.sdc = 10;
			this.armorRating = 10;
			this.isDefending = false
		}

		public String getName() {
			return this.name;
		}

		public int getXpos() {
			return this.xpos;
		}

		public int getYpos() {
			return this.ypos;
		}

		public int getSpeed() {
			return this.speed;
		}

		public int getOrientation() {
			return this.orientation;
		}
						
		public int getSdc() {
			return sdc;
		}

		public int getArmorRating() {
			return armorRating;
		}

		public void rotate(int addRotation) {
			this.orientation = this.orientation + addRotation;
		}
		
		public void move() {
			if (this.orientation % 4 == 0) {
				this.xpos = this.xpos + this.speed;
			}
			else if (this.orientation % 4 == 1) {
				this.ypos = this.ypos + this.speed;
			}
			else if (this.orientation % 4 == 2) {
				this.xpos = this.xpos - this.speed;
			}
			else {
				this.ypos = this.ypos - this.speed;
			}
		}
			
		public double distance(Robot rob) {
			double a = this.xpos - rob.xpos;
			double b = this.ypos - rob.ypos;
			double c = (Math.pow(a, 2) +  Math.pow(b, 2));
			return Math.sqrt(c);
		}
			
		
		public String toString() {
			return "Robot [name: " + this.name + ", position: (" + this.xpos + ", " + this.ypos + "), speed: " + this.speed + ", orientation:"
					+ orientation + "]";
		}
		

		public static void main(String[] args) {
			Robot ronnie = new Robot("ronnie", 0, 0, 2, 1);
			System.out.println(ronnie.toString());
			ronnie.move();
			System.out.println(ronnie.toString());
			ronnie.rotate(3);
			ronnie.move();
			ronnie.move();
			System.out.println(ronnie.toString());
			Robot jonnie = new Robot("jonnie", 0, 0, 2, 1);
			System.out.println(ronnie.distance(jonnie));
			
			
			

		}
}
