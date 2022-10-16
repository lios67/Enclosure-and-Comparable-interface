package HW5;

public class Square implements Enclosure, Comparable {
	public double side;
	public Square () {
		side = 0.0;
	}
	public Square (double s) {
		side = s;
	}
	public void setSquare (double s) {
		this.side = s;
	}
	public double getSquare () {
		return side;
	}
	public double area () {
		return side * side;
	}
	public double perimeter () {
		return side * 4.0;
	}
	public int compareTo(Object o) {
		if (side > ((Square)o).side) {
			return 1;
		}
		else if (side < ((Square)o).side) {
			return -1;		
		}
		else {
			return 0;
	
		}
	}
}
