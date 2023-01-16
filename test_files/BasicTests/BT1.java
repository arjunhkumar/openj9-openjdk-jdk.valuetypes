import datastructures.Line;
import datastructures.Point;

public class BT1 {

    public static void main(String args[]) {
            BT1 bt = new BT1();
            // for(int i=0;i<(args.length+1*3);i++){
                bt.foo(new Line());
                bt.foo(new Line(1,2,1,2));
                bt.foo(new Line(args.length,(args.length+3),1,2));
            // }
    }

    public void foo(Line l1){
        System.out.println("Starting-----");
        // Line l1 = new Line();
        // Point p = l1.p2();
        int x = l1.p1.x + 1 ;
        int y = x + l1.p2.y + 8;
        System.out.println("R1: "+y);
        // System.out.println(l1.p1().y());
        // System.out.println(l1.p2().x());
        // System.out.println(l1.p2().y());
        System.out.println("Completed-----");
    }

}