//By Tyler Day
public class Frame {
	//Create private variable
	private double Size;
	
	private String Type;
	//Default
	public Frame() {
		this.Size = 18.5;
		this.Type = "Diamond";
	}
	//Custom
	public Frame(double Size, String Type) {
		setSize(Size);
		setType(Type);
	}
	//Gets the variable
	public double getSize() {
		return Size;
	}
	
	public String getType() {
		return Type;
	}
	//Sets the variable but has to be valid
	public void setSize(double Size) {
		if(Size >= 18.5 && Size <= 60.0) {
			this.Size = Size;
		} else {
			this.Size = 18.5;
		}
	}
	
	public void setType(String Type) {
		if(Type.equals("Diamond") || Type.equals("Step-Through") || Type.equals("Truss") || Type.equals("Penny-Farthing")) {
			this.Type = Type;
		} else {
			this.Type = "Diamond";
		}
	}
	//Sees if the two frames are equal
	public boolean equals(Frame other) {
		return this.Size == other.Size && this.Type.equalsIgnoreCase(other.Type);
	}
	//Converts it to a string to be printed out
	public String toString() {
		return "[Frame] Size: " + this.Size + " Type: " + this.Type;
	}
}
