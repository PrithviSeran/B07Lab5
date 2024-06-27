package lab4;

public class Pentagon {
	Point A;
    Point B;
    Point C;
    Point D;
    Point E;
    
    public Pentagon(Point A, Point B, Point C, Point D, Point E) {
    	this.A = A;
    	this.B = B;
    	this.C = C;
    	this.D = D;
    	this.E = E;
    }
    
    public double perimeter() {
    	return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
    }
    
    public double area() {
        // Shoelace formula for polygon area
        return 0.5 * Math.abs(A.x * B.y + B.x * C.y + C.x * D.y + D.x * E.y + E.x * A.y 
                           - (A.y * B.x + B.y * C.x + C.y * D.x + D.y * E.x + E.y * A.x));
    }
    
    public boolean isRegular() {
        double side1 = A.distance(B);
        double side2 = B.distance(C);
        double side3 = C.distance(D);
        double side4 = D.distance(E);
        double side5 = E.distance(A);
        return side1 == side2 && side2 == side3 && side3 == side4 && side4 == side5;
    }
    
    public Point centroid() {
        double centerX = (A.x + B.x + C.x + D.x + E.x) / 5.0;
        double centerY = (A.y + B.y + C.y + D.y + E.y) / 5.0;
        return new Point((int) centerX, (int) centerY);
    }
    
    public void printCoordinates() {
        System.out.println("A: (" + A.x + ", " + A.y + ")");
        System.out.println("B: (" + B.x + ", " + B.y + ")");
        System.out.println("C: (" + C.x + ", " + C.y + ")");
        System.out.println("D: (" + D.x + ", " + D.y + ")");
        System.out.println("E: (" + E.x + ", " + E.y + ")");
    }
    
    
}
