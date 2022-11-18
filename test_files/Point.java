public primitive class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x() {
        return x;
    }

    int y() {
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

    public static Point makePoint(int x, int y) {
        return new Point(x, y);
    }
}