import datastructures.Line;
import datastructures.Point;

public class BT1 {

    public static void main(String args[]) {
            BT1 bt = new BT1();
            bt.foo();
    }

    public void foo(){
        Line l1 = new Line();
        System.out.println(l1.toString());
        System.out.println(l1.p1().x());
        // System.out.println(l1.p1().y());
        // System.out.println(l1.p2().x());
        // System.out.println(l1.p2().y());
    }

}