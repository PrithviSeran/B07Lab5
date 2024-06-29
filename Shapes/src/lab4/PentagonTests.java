
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
