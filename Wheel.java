//By Tyler Day
public class Wheel {
	//Creates private variable
	private double Diameter;
	
	private double Width;
	//Default 
	public Wheel() {
		this.Diameter = 16.0;
		this.Width = 1.0;
	}
	//Custom
	public Wheel(double Diameter, double Width) {
		setDiameter(Diameter);
		setWidth(Width);
	}
	//Gets variables
	public double getDiameter() {
		return Diameter;
	}
	
	public double getWidth() {
		return Width;
	}
	//Sets the variable but has to be valid
	public void setDiameter(double Diameter) {
		if(Diameter >= 16.0 && Diameter <= 55.0) {
			this.Diameter = Diameter;
		} else {
			this.Diameter = 16.0;
		}
	}
	
	public void setWidth(double Width) {
		if(Width >= 1.0 && Width <= 2.5) {
			this.Width = Width;
		} else {
			this.Width = 1.0;
		}
	}
	//Sees if the two wheels are equal
	public boolean equals (Wheel other) {
		return this.Diameter == other.Diameter && this.Width == other.Width;
	}
	//Converts it to a string to be printed out
	public String toString() {
		return "[Wheel] Diameter: " + this.Diameter + " Width: " + this.Width;
	}
}
