package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTestCases {

	@Test
	void testAreaUnitCircle() {
		Circle circle = new Circle(1);
		double area = circle.area();
		
		assertEquals(area, Math.PI);
	}
	
	void testAreaCircle() {
		Circle circle = new Circle(5);
		double area = circle.area();
		
		assertEquals(area, Math.PI*5*5);
	}

}
