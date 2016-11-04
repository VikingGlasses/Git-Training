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

        
        Author author1 = new Author("harald1","epost",'M');
        Author author2 = new Author("harald2","epost",'G');
        Author author3 = new Author("harald3","epost",'s');
        
        Author[] author = new Author[3];
        author[0] = author1;
        author[1] = author2;
        author[2] = author3;
        
        Book minBok = new Book("Minbok",author,12);
        
        System.out.println(minBok);

    }

}
