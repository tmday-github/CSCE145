
public class Rectangle {
	
	private double length;
	private double width;
	
	//Custom Rectangle
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//Gets length
	public double getLength() {
		return length;
	}
	
	//Gets width
	public double getWidth() {
		return width;
	}
	
	//Gets area
	public double getArea() {
		return length * width;
	}
	
	//Converts to string
	public String toString() {
		return "Length: " + this.length + ", Width: " + this.width + ", Area: " + getArea();
	}
	
	
	
}
