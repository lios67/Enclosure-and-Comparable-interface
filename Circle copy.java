package HW5;

public class Circle implements Enclosure, Comparable {
	public double radius;
	public static final double PI=3.14159;
	public Circle (double r) {
		radius = r;
	}
	public Circle () {
		radius = 0.0;
	}
	public void setRadius (double r) {
		this.radius = r;
	}
	public double getRadius () {
		return radius;
	}
	public double area () {
		return PI * radius *radius;
	}
	public double perimeter () {
		return PI * radius * 2;
	}
	public int compareTo(Object o) {
		Circle other = (Circle) o;
		if (getRadius() > other.getRadius()) {
			return 1;
		}
		else if (getRadius() < other.getRadius()) {
			return -1;		
		}
		else {
			return 0;
	
		}
	}
}
