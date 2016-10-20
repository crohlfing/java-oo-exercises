import java.util.Arrays;

public class Course {
	
	private String name;
	private int credits;
	private int remainingSeats;
	private Student[] roster;
	
	public Course(String name, int credits, int remainingSeats){
		
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.roster = new Student[remainingSeats];
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

	public int getRemainingSeats() {
		return remainingSeats;
	}

	public Student[] getRoster() {
		return roster;
	}
	
	public boolean addStudent(Student st1) {
		if (this.remainingSeats > 0) {
			for (int i = 0; i < this.roster.length - this.remainingSeats; i++){
				if (roster[i] == st1) {
					return false;
				}	
			}
			roster[this.roster.length - this.remainingSeats] = st1;
			this.remainingSeats -= 1;
			return true;
		}
		return false;
	}
	
	public String generateRoster() {
		String fullRoster = "";
		for (int i = 0; i < this.roster.length - this.remainingSeats; i++) {
			fullRoster = fullRoster + roster[i] + "/n ";
		}
		return fullRoster;
			
	
	}
	
	public double averageGPA() {
		double totalGPA = 0;
		for (int i = 0; i < this.roster.length - this.remainingSeats; i++) {
			totalGPA = totalGPA + roster[i].getGPA();
		}
		return totalGPA / (this.roster.length - this.remainingSeats);
	
	}
	
	public String toString() {
		return "Course [name=" + name + ", credits=" + credits + ", remainingSeats=" + remainingSeats + ", roster="
				+ Arrays.toString(roster) + "]";
	}
	
	

}
