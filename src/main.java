import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Classe Test Rapide
 */
public class main {
    public static void main(String[] args) {
        Book book1 = new Book(30 ,"Jean-Jacques Mu" , "9782919539", "Mon accent apostrophe");
        Book book2 = new Book(20, "Fabienne Brugel & Jean-Paul Ramat", "8964730182", "La Force des Gueux");
        Book book3 = new Book(19, "Chinua Achebe", "28039185454", "Le monde s'effondre");
        Book book4 = new Book(10, "Albert Camus", "2394827638", "L'Étranger");
        Book book5 = new Book(15, "Fiodor Dostoïevski", "7897854", "L'Idiot");
        Book book6 = new Book(25, "Fiodor Dostoïevski", "7897854", "Les Démons");

        Object obj = book5;
        System.out.println(obj.equals(book6));
        System.out.println("-----------------------------");

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
        System.out.println("-----------------------------");


        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        System.out.println(books.size());
        System.out.println(books);
        System.out.println("-----------------------------");

        ArrayList<Book> Lbooks = new ArrayList<>();
        Lbooks.add(book1);
        Lbooks.add(book2);
        Lbooks.add(book3);
        Lbooks.add(book4);
        Lbooks.add(book5);
        Lbooks.add(book6);

        Collections.sort(Lbooks,Criteria.AUTHOR.getComparator(true));
        System.out.println("liste triée :");
        for(Book str: Lbooks){
            System.out.println(str);
        }
        System.out.println("-----------------------------");

    }
}
