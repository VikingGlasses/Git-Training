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

        Author author1 = new Author("Harald Billstein", "harald@epost.com", 'M');
        Author author2 = new Author("Lisette Billstein", "Lisette@epost.com", 'F');
        Author author3 = new Author("Seth Billstein", "Seth@epost.com", 'M');

        Author[] author = new Author[3];
        author[0] = author1;
        author[1] = author2;
        author[2] = author3;

        Book minBok = new Book("Hemma hos röran!", author, 120);
        minBok.setQty(7);

        System.out.println(minBok);
        MyPoint[] myPoints = new MyPoint[10];
        for (int i = 0; i < 10; ++i) {
            myPoints[i] = new MyPoint(i+1,i+1);
        }
        
        for (int i =0; i < myPoints.length;i++){
            System.out.println(myPoints[i]);
        }
        

    }

}
