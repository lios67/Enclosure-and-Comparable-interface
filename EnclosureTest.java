package HW5;

public class EnclosureTest {
	public static void main(String[] args) {
		
	   Circle e1 = new Circle (5.0);
	   Circle e2 = new Circle (5.0);
	   Square e3 = new Square (25.0);
	   Square e4 = new Square (30.0);
	    	
	   System.out.println("Shape 1: Area = " + e1.area() +" Perimeter = " + e1.perimeter());
	   System.out.println("Shape 2: Area = " + e2.area() +" Perimeter = " + e2.perimeter());
	   System.out.println("Shape 3: Area = " + e3.area() +" Perimeter = " + e3.perimeter());
	   System.out.println("Shape 4: Area = " + e4.area() +" Perimeter = " + e4.perimeter());		
	   System.out.println("For Shape 1 and 2 Comparable returns " + e1.compareTo(e2));
	   System.out.println("For Shape 3 and 4 Comparable returns " + e3.compareTo(e4));
	  }
}
