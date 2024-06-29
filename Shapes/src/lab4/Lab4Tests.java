package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




public class Lab4Tests {

    // Point distance test
    @Test
    public void testDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        assertEquals(5.0, p1.distance(p2), 0.001);
    }

    // Point equals tests
    
    @Test
    public void testEqualsSamePoints() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        assertTrue(p1.equals(p2));
    }
    
    @Test
    public void testEqualsSamePoint() {
        Point p1 = new Point(1, 1);
        assertTrue(p1.equals(p1));
    }
    
    @Test
    public void testEqualsNULL() {
        Point p1 = new Point(1, 1);
        assertFalse(p1.equals(null));
    }
    

    @Test
    public void testEqualsDifferentPoints() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void testEqualsDifferentY() {
        Point p1 = new Point(1, 1);
        Point p4 = new Point(1, 2);
        assertFalse(p1.equals(p4));
    }
    
    @Test
    public void testEqualsDifferentX() {
        Point p1 = new Point(1, 1);
        Point p4 = new Point(2, 1);
        assertFalse(p1.equals(p4));
    }

    @Test
    public void testEqualsDifferentObject() {
        Point p1 = new Point(1, 1);
        String notAPoint = "Not a Point";
        assertFalse(p1.equals(notAPoint));
    }

    // Point hashCode tests
    @Test
    public void testHashCodeEqualPoints() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 1);
        assertEquals(p1.hashCode(), p2.hashCode());
    }

    @Test
    public void testHashCodeDifferentPoints() {
        Point p1 = new Point(1, 1);
        Point p3 = new Point(1, 2);
        assertNotEquals(p1.hashCode(), p3.hashCode());
    }

    // Triangle perimeter test
    @Test
    public void testPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);
        Triangle t = new Triangle(p1, p2, p3);
        assertEquals(12.0, t.perimeter(), 0.001);
    }

    // Triangle isEquilateral tests
    @Test
    public void testIsEquilateralTrue() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(Math.sqrt(5), 0);
        Point p3 = new Point(Math.sqrt(5) / 2, Math.sqrt(15) / 2);
        Triangle t1 = new Triangle(p1, p2, p3);
        assertTrue(t1.isEquilateral());
    }

    @Test
    public void testIsEquilateralFalse() {
        Point p4 = new Point(0, 0);
        Point p5 = new Point(4, 0);
        Point p6 = new Point(0, 3);
        Triangle t2 = new Triangle(p4, p5, p6);
        assertFalse(t2.isEquilateral());
    }


    // Pentagon Tests
    @Test
    public void testPentPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(0, 1);
        Point E = new Point(-1, 0);
        Pentagon pentagon = new Pentagon(A, B, C, D, E);

        double expectedPerimeter = A.distance(B) + B.distance(C) + C.distance(D) + D.distance(E) + E.distance(A);
        assertEquals(expectedPerimeter, pentagon.perimeter(), 0.001);
    }

    @Test
    public void testArea() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(1, 1);
        Point D = new Point(0, 1);
        Point E = new Point(-1, 0);
        Pentagon pentagon = new Pentagon(A, B, C, D, E);

        double expectedArea = 0.5 * Math.abs(A.x * B.y + B.x * C.y + C.x * D.y + D.x * E.y + E.x * A.y 
                           - (A.y * B.x + B.y * C.x + C.y * D.x + D.y * E.x + E.y * A.x));
        assertEquals(expectedArea, pentagon.area(), 0.001);
    }

    @Test
    public void testIsRegular() {
        Point A = new Point(0, 0);
        Point B = new Point(1, 0);
        Point C = new Point(2, 1);
        Point D = new Point(1, 2);
        Point E = new Point(0, 1);
        Pentagon pentagon = new Pentagon(A, B, C, D, E);

        assertFalse(pentagon.isRegular());

        Point F = new Point(0, 0);
        Point G = new Point(1, 1);
        Point H = new Point(2, 0);
        Point I = new Point(1, -1);
        Point J = new Point(0, -1);
        Pentagon regularPentagon = new Pentagon(F, G, H, I, J);

        assertFalse(regularPentagon.isRegular());
    }

    @Test
    public void testCentroid() {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(4, 3);
        Point D = new Point(0, 3);
        Point E = new Point(2, 5);
        Pentagon pentagon = new Pentagon(A, B, C, D, E);

        Point expectedCentroid = new Point(2, 2);
        Point actualCentroid = pentagon.centroid();
        assertEquals(expectedCentroid.x, actualCentroid.x);
        assertEquals(expectedCentroid.y, actualCentroid.y);
    }

    //WHY?
}
