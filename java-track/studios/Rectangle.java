
public class Rectangle {
	

	private double length;
	private double width;
	private double area;
	private double perimeter;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perimeter = (length*2) + (width*2);
	}

	public void square() {
		if (this.length == this.width) {
			System.out.println("it's square!");
		}
		else {
			System.out.println("not square.");
		}
	}
	
	public void compare(double area2) {
		if (this.area < area2) {
			System.out.println("the new one is bigger");
		}
		else {
			System.out.println("the new one is not bigger");
		}
	}
	
	public double getArea() {
		return area;
	}


	public double getPerimeter() {
		return perimeter;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
