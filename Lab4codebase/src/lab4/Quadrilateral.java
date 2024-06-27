package lab4;

public class Quadrilateral{

    Point A;
    Point B;
    Point C;
    Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter(){
        double AB = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        double BC = Math.sqrt((C.x - B.x) * (C.x - B.x) + (C.y - B.y) * (C.y - B.y));
        double CD = Math.sqrt((C.x - D.x) * (C.x - D.x) + (C.y - D.y) * (C.y - D.y));
        double DA = Math.sqrt((A.x - D.x) * (A.x - D.x) + (A.y - D.y) * (A.y - D.y));

        return AB + BC + CD + DA;
    }


}