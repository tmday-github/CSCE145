import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RectangleManager manager = null;
		boolean running = true;
		
		while (running) {
			System.out.println("Rectangle Sorting Program");
            System.out.println("1. Enter Rectangle Data");
            System.out.println("2. Sort and Display Areas (Smallest to Largest)");
            System.out.println("3. Sort and Display Areas (Largest to Smallest)");
            System.out.println("4. Display Average Area");
            System.out.println("5. Display Minimum Area");
            System.out.println("6. Display Maximum Area");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
            	manager = createRectangleManager(scanner);
            } 
            
            else if (choice == 2) {
            	if(manager == null) {
            		System.out.println("No data available. Please enter rectangle data first.");
            	} else {
            		manager.sortRectangles(true);
            		manager.displayRectangles();
            	}
            } 
            
            else if (choice == 3) {
            	if (manager == null) {
            		System.out.println("No data available. Please enter rectangle data first.");
            	} else {
            		manager.sortRectangles(false);
            		manager.displayRectangles();
            	}
            } 
            
            else if (choice == 4) {
            	if (manager == null) {
            		System.out.println("No data available. Please enter rectangle data first.");
            	} else {
            		System.out.println("Average Area: " + manager.calcAvgArea());
            	}
            }
            
            else if (choice == 5) {
            	if (manager == null) {
            		System.out.println("No data available. Please enter rectangle data first.");
            	} else {
            		System.out.println("Minimum Area: " + manager.findMinArea());
            	}
            } 
            
            else if (choice == 6) {
            	if (manager == null) {
                    System.out.println("No data available. Please enter rectangle data first.");
                } else {
                	System.out.println("Maximum Area: " + manager.findMaxArea());
                }
            }
            
            else if (choice == 7) {
            	running = false;
            	System.out.println("Exiting the program. Goodbye!");
            } 
            
            else {
            	System.out.println("Invalid choice. Please try again.");
            }
		}
	}
	
	private static RectangleManager createRectangleManager (Scanner scanner) {
		int size;
		do {
			System.out.print("Enter the number of rectangles (must be positive): ");
			size = scanner.nextInt();
		} 
		while (size <= 0);
		
		RectangleManager manager = new RectangleManager(size);
		manager.inputRectangles(scanner);
		return manager;
	}

}
