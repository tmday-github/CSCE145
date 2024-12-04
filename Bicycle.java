//By Tyler Day
public class Bicycle {
	//Create private variables
	private String Make;
	
	private Wheel frontWheel;
	
	private Wheel backWheel;
	
	private Frame Frame;
	//Default
	public Bicycle() {
		this.Make = "none";
		this.frontWheel = new Wheel();
		this.backWheel = new Wheel();
		this.Frame = new Frame();
	}
	//Custom
	public Bicycle(String Make, Wheel frontWheel, Wheel backWheel, Frame Frame) {
		setMake(Make);
		setFrontWheel(frontWheel);
		setBackWheel(backWheel);
		setFrame(Frame);
	}
	//Gets the variable
	public String getMake() {
		return Make;
	}
	
	public Wheel getFrontWheel() {
		return frontWheel;
	}
	
	public Wheel getBackWheel() {
		return backWheel;
	}
	
	public Frame getFrame() {
		return Frame;
	}
	//Sets the variable if it is valid
	public void setMake(String Make) {
		if (Make != null && !Make.isEmpty()) {
			this.Make = Make;
		} else {
			this.Make = "none";
		}
	}
	
	public void setFrontWheel(Wheel frontWheel) {
		if(frontWheel != null) {
			this.frontWheel = frontWheel;
		} else {
			this.frontWheel = new Wheel();
		}
	}
	
	public void setBackWheel(Wheel backWheel) {
		if(backWheel != null) {
			this.backWheel = backWheel;
		} else {
			this.backWheel = new Wheel();
		}
	}
	
	public void setFrame(Frame Frame) {
		if(Frame != null) {
			this.Frame = Frame;
		} else {
			this.Frame = new Frame();
		}
	}
	//Sees if the two bikes are equal
	public boolean equals(Bicycle other) {
		return this.Make.equalsIgnoreCase(other.Make) &&
	               this.frontWheel.equals(other.frontWheel) &&
	               this.backWheel.equals(other.backWheel) &&
	               this.Frame.equals(other.Frame);
	}
	//Converts to a string so it can be printed out
	public String toString() {
		return "[Bicycle] Make: " + this.Make + " Front Wheel: " + this.frontWheel + " Back Wheel: " + this.backWheel + " Frame: " + this.Frame;
	}
	
}
