package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTestCases {

	@Test
	void testAreaUnitCircle() {
		Point p = new Point(0,0);
		Circle circle = new Circle(p, 1);
		double area = circle.area();
		assertEquals(area, Math.PI);
	}

	@Test
	void testAreaCircle() {
		Point p = new Point(0,0);
		Circle circle = new Circle(p, 5);
		double area = circle.area();
		assertEquals(area, Math.PI*5*5);
	}

}
