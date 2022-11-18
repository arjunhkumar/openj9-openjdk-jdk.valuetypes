
/** Container class for inlined point objects */
package datastructures;

public final class Line {
    private Point p1;
    private Point p2;

    public Line() {
        this.p1 = new Point(0,0);
        this.p2 = new Point(0,0);
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point p1() {
        return p1;
    }

    public Point p2() {
        return p2;
    }
}