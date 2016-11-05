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
        Customer c1 = new Customer(001,"harald",10);
        Invoice inv = new Invoice(001,c1,100);
        
        System.out.println(inv.getAmountAfterDiscount());

    }

}
