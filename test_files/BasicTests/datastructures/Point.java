/** Inline class for point objects */
package datastructures;

public primitive class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
    static Point.val newVal(int x, int y) {
        return new Point(x, y);
    }
    static Point.ref toRef(Object o) {
        return (Point.ref) o;
    }
    static Point.val toVal(Point.ref o) {
        return (Point.val) o;
    }
}