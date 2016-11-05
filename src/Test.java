/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harald
 */
public class Test {

    public static void main(String[] args) {

        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(2,2);
        MyRectangle rec = new MyRectangle(p1,p2);
        
        System.out.println(rec.getPerimiter());
        

    }

}
