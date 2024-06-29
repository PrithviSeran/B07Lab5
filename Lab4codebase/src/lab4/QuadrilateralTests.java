package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuadrilateralTests {
    @Test
    public void testPerimeterOfRectangle() {
        Point a = new Point(0, 0);
        Point b = new Point(0,5);
        Point c = new Point(7,5);
        Point d = new Point(7,0);
        double expected = 2*5 + 2*7;
        Quadrilateral q1 = new Quadrilateral(a, b, c, d);
        assertEquals(q1.perimeter(), expected);
    }

    @Test
    public void testPerimeterOfParallelogram() {
        Point a = new Point(0, 0);
        Point b = new Point(2,2);
        Point c = new Point(4,2);
        Point d = new Point(2,0);
        double expected = 2*(Math.sqrt(8) + 2);
        Quadrilateral q1 = new Quadrilateral(a, b, c, d);
        assertEquals(q1.perimeter(), expected);
    }

}
