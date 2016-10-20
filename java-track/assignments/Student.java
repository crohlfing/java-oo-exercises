
public class Student {
	
	private String nameFirst;
	private String nameLast;
	private int studentID;
	private double GPA;
	private int credits;
	
	public Student(String nameFirst, String nameLast, int studentID) {
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.studentID = studentID;
		this.GPA = 0.0;
		this.credits = 0;
	}
	
	

	public String getName() {
		return nameFirst + " " + nameLast;
	}
	
	public String getNameFirst() {
		return nameFirst;
	}



	public String getNameLast() {
		return nameLast;
	}



	public int getStudentID() {
		return studentID;
	}



	public double getGPA() {
		return GPA;
	}



	public int getCredits() {
		return credits;
	}



	public void setGPA(double gPA) {
		GPA = gPA;
	}



	public void setCredits(int credits) {
		this.credits = credits;
	}



	public String getClassStanding(){
		if (this.credits < 30) {
			return "Freshman";
		}
		else if (this.credits < 60) {
			return "Sophomore";
		}
		else if (this.credits < 90) {
			return "Junior";
		}
		else {
			return "Senior";
		}
		
	}
	
	public void submitGrade(double grade, int creds){
		double qualityScore = grade * creds;
		this.GPA = this.GPA * this.credits + qualityScore;
		this.credits = this.credits + creds;
		this.GPA = this.GPA / this.credits;
		this.GPA = Math.round (this.GPA * 1000d) / 1000d;
	}
	
	public double computeTuition() {
		/*if (this.credits % 15 == 0) {
			int sems = this.credits / 15;
			return sems * 20000;
		}
		else {
			if (this.credits > 15) {*/
				int n = this.credits / 15;
				int m = this.credits % 15;
				return (double)(n * 20000) + (m * 1333.33);
		/*	}
			
			
		double tuition = (double)this.credits * 1333.33;
		return tuition;	
		}*/
	}
	
	public Student createLegacy (Student st1, Student st2) {
		int st3ID = st1.studentID + st2.studentID;
		double st3GPA = (st1.GPA + st2.GPA) / 2;
				
		Student st3 = new Student (st1.getName(), st2.getName(), st3ID);
		st3.setGPA(st3GPA);
		if (st1.credits > st2.credits){
			st3.setCredits(st1.credits);
		}
		else{
			st3.setCredits(st2.credits);
		}	
		return st3;
	}

	public String toString() {
		return "Student [nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", studentID=" + studentID + ", GPA="
				+ GPA + ", credits=" + credits + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
