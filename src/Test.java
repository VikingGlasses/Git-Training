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
        Customer myCustomer = new Customer(007,"Bond",50);
        Account myAc = new Account(001,myCustomer,1000);
        
        
        myAc = myAc.withraw(1200);
        
        
        System.out.println(myAc);
        

    }

}
