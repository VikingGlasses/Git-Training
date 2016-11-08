/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harald
 */
import java.util.*;

public class Test {

    public static void main(String[] args) {

        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<String>();
        myLinkedHashSet.add("Beatrice");
        myLinkedHashSet.add("Ellinor");
        System.out.println(myLinkedHashSet); //ett Set har inga index, går ej att hämta specifik
        
        TreeMap<String, String> myTreeMap = new TreeMap<String, String>();
        myTreeMap.put("katt", "cat");
        myTreeMap.put("hund", "dog");
        System.out.println(myTreeMap.get("hund"));
        
        Author author1 = new Author("Harald Billstein","harald@epost.com",'M');
        Author author2 = new Author("Lisette Billstein","Lisette@epost.com",'F');
        Author author3 = new Author("Seth Billstein","Seth@epost.com",'M');
        
        Author[] author = new Author[3];
        author[0] = author1;
        author[1] = author2;
        author[2] = author3;
        
        Book minBok = new Book("Hemma hos röran!",author,120);
        minBok.setQty(7);
        
        System.out.println(minBok);

    }

}
