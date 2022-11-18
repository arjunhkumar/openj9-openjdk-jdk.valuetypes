/*
 * Copyright (c) 2021, 2022, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


/*
 * @test
 * @summary test reflection on primitive classes
 * @compile --enable-preview --source ${jdk.version} BasicTest.java
 * @run testng/othervm --enable-preview BasicTest
 */


import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;



public class VTTest {

    public static void main(String args[]) {
		
        // for(int i=0;i<500;i++){
            VTTest bt = new VTTest();
            bt.foo();
        // }
        
    }

    void foo(){
        Line l1 = new Line();
        System.err.println(l1.p1().x());
        Line l2 = new Line(1,2,1,2);
        System.err.println(l2.p1().y());
        Point p = new Point(1,2);
        Point.newVal(45, 21);
        System.err.println(p.x);
        System.err.println(p.y);
        Point o2 = Point.toRef(p);
        Point o1 = Point.toVal(p);
        Value v = new Value(13);
        System.err.println(v.toString());
    }
}
