package lab4;

public class Circle {
	Point centre;
	double radius;
	
	public Circle(Point p, double radius) {
		this.centre = p;
		this.radius = radius;
	}
	public double area() {
		return Math.PI * (radius * radius);
	}
	
}
