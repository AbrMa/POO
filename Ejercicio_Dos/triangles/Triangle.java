import java.lang.Math;
import java.util.*;
import javax.swing.*;
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	private String type;

	public Triangle() {
		side1 = 5;
		side2 = 5;
		side3 = 5;
		type = "Equilateral";
	}
	
	public Triangle(int a) {
		side1 = 10;
		side2 = 10;
		side3 = 7;
		type = "Isosceles";
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public void changeSide1(double newValue) {
		side1 = newValue;	
		if (side1 == side2 && side2 == side3)
			type = "Equilateral";

		else if (side1 != side2 && side1 != side3 && side2 != side3)
			type = "Scalene";

		else
			type = "Isosceles";	
	}

	public void changeSide2(double newValue) {
		side2 = newValue;	
		if (side1 == side2 && side2 == side3)
			type = "Equilateral";

		else if (side1 != side2 && side1 != side3 && side2 != side3)
			type = "Scalene";

		else
			type = "Isosceles";
	}	

	public void changeSide3(double newValue) {
		side3 = newValue;
		if (side1 == side2 && side2 == side3)
			type = "Equilateral";

		else if (side1 != side2 && side1 != side3 && side2 != side3)
			type = "Scalene";

		else
			type = "Isosceles";	
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public double getArea() {
		if (type == "Scalene") return 0;
		double S = (side1 + side2 + side3) / 2;
		double A = Math.sqrt(S * ((S - side1) * (S - side2) * (S - side3)));
		return A;
	}

	public static double sumAreas(Triangle t1, Triangle t2) {
		return t1.getArea() + t2.getArea();	
	}

	public void printTriangle(Triangle t1) {
		JFrame frame = new JFrame("JOptionPane showMessageDialog example");
		JOptionPane.showMessageDialog(
				frame,
				"Side 1 : " + side1 +
				"\nSide 2 : " + side2 +
				"\nSide 3 : " + side3 +
				"\nType : " + type.toUpperCase() +
				"\nPerimeter : " + t1.getPerimeter() +
				"\nArea : " + t1.getArea());
		System.out.println();
	}

	public static boolean compareTriangles(Triangle t1, Triangle t2) {
		ArrayList<Double> sides1 = new ArrayList();
		ArrayList<Double> sides2 = new ArrayList();
		sides1.add(t1.getSide1());
		sides1.add(t1.getSide2());
		sides1.add(t1.getSide3());
		sides2.add(t2.getSide1());
		sides2.add(t2.getSide2());
		sides2.add(t2.getSide3());
		Collections.sort(sides1);
		Collections.sort(sides2);
		boolean isEqual = sides1.equals(sides2);
		return isEqual;
	}
}
