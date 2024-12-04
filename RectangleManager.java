import java.util.Scanner;

public class RectangleManager {
	private Rectangle[] rectangles;
	private int size;
	
	//Custom Rectangle Manager
	public RectangleManager(int size) {
		this.size = size;
		this.rectangles = new Rectangle[size];
	}
	
	//Inputs data for rectangles
	public void inputRectangles(Scanner scanner) {
			for (int i = 0; i < size; i++) {
				System.out.print("Enter length of rectangle " + (i + 1) + ": ");
				double length = scanner.nextDouble();
				System.out.print("Enter width  of rectangle " + (i + 1) + ": ");
				double width = scanner.nextDouble();
				rectangles[i] = new Rectangle(length , width);
			}
			System.out.println("Rectangle data entered successfully.");
	}
	
	//Sorts rectangles by area
	public void sortRectangles(boolean ascending) {
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if((ascending && rectangles[j].getArea() > rectangles[j + 1].getArea()) || (!ascending && rectangles[j].getArea() < rectangles[j + 1].getArea())) {
					Rectangle temp = rectangles[j];
					rectangles[j] = rectangles[j + 1];
					rectangles[j + 1] = temp;
				}
			}
		}
		System.out.println("Rectangles sorted successfully.");
	}
	
	//Display all rectangles
	public void displayRectangles() {
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}
	}
	
	//Calculate avg area
	public double calcAvgArea() {
		double sum = 0;
		for (Rectangle rectangle : rectangles) {
			sum += rectangle.getArea();
		}
		return sum / size;
	}
	
	//Find min area
	public double findMinArea() {
		double min = rectangles[0].getArea();
		for (Rectangle rectangle : rectangles) {
			if (rectangle.getArea() < min) {
				min = rectangle.getArea();
			}
		}
		return min;
	}
	
	//Find max area
	public double findMaxArea() {
		double max = rectangles[0].getArea();
		for (Rectangle rectangle : rectangles) {
			if (rectangle.getArea() > max) {
				max = rectangle.getArea();
			}
		}
		return max;
	}
}
