package lab4;

public class Circle {
	Point centre;
	double radius;
	
	public Circle(Point p, double radius) {
		this.centre = p;
		this.radius = radius;
	}
	// radius at (0,0)
	public Circle(double radius) {
		this.centre = new Point(0,0);
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI * (radius * radius);
	}
	
}
