import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book(15, "Chinua Achebe", "0292107315", "Le monde s'effondre");
        Book book2 = new Book(20, "Miguel de Cervantes", "8964730182", "Don Quichotte");
        Book book3 = new Book(19, "Homère", "2803918263", "Odyssée");
        Book book4 = new Book(10, "Albert Camus", "2394827638", "L'Étranger");
        Book book5 = new Book(22, "Alexandre Dumas", "123", "Les Trois Mousquetaires");
        Book book6 = new Book(25, "Caterina Mognato", "123", "Les Trois Mousquetaires");

//        Object obj = book5;
//        System.out.println(obj.equals(book6));

        Inventory inventory=new Inventory();

        inventory.add(book1,2);
        inventory.add(book2,4);
        inventory.add(book3,6);
        inventory.add(book4,7);
        inventory.add(book5,10);
        inventory.add(book6,25);

        BookStore store = new BookStore();
        store.restock(inventory);

//        System.out.println(store.get(book5));
        System.out.println(store);


        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

//        System.out.println(books.size());
//        System.out.println(books);

        //Collections.sort(books,Criteria.PRICE.getComparator(true));
        //for(Book str: books){
            //System.out.println(str);
        //}


    }
}
