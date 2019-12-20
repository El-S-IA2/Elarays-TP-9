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

        Object obj = book5;
        System.out.println(obj.equals(book6));


        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println(books.size());
        Collections.sort(books,Criteria.PRICE.getComparator(false));
        for(Book str: books){
            System.out.println(str);
        }


    }
}
