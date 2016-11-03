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
    
    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle("black", 3.5);
        System.out.println(circle1.getRadius());
        circle1.setRadius(50);
        System.out.println(circle1.getArea());
    }
    
}
