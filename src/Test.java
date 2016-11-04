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
        
        MyPoint point = new MyPoint(3,4);
        MyCircle circle = new MyCircle(point,4);
        
        
        MyTriangle tri = new MyTriangle(1,2,3,4,5,6);
        
        System.out.println(tri.toString());
        

    }

}
