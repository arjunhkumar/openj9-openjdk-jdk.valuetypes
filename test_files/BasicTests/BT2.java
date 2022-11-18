import datastructures.Line;
import datastructures.Point;

public class BT2 {

    public static void main(String args[]) {
            BT2 bt = new BT2();
            bt.foo();
    }

    public void foo(){
        Line l1 = new Line();
        System.out.println(l1.toString());
        System.out.println(l1.p1().x());
        System.out.println(l1.p1().y());
        System.out.println(l1.p2().x());
        System.out.println(l1.p2().y());
        Line l2 = new Line(1,2,3,4);
        System.out.println(l2.toString());
        System.out.println(l2.p1().x());
        System.out.println(l2.p1().y());
        System.out.println(l2.p2().x());
        System.out.println(l2.p2().y());
        Line l3 = new Line(new Point(4,5),new Point(7,8));
        System.out.println(l3.toString());
        System.out.println(l3.p1().x());
        System.out.println(l3.p1().y());
        System.out.println(l3.p2().x());
        System.out.println(l3.p2().y());
        Point p1 = new Point(4,5);
        System.out.println(p1.y());
    }

}