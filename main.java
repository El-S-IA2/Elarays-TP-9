import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        Inventory inventaire = new Inventory();
        Book book1 = new Book(15, "Chinua Achebe", "0292107315", "Le monde s'effondre");
        Book book2 = new Book(20, "Miguel de Cervantes", "8964730182", "Don Quichotte");
        Book book3 = new Book(19, "Homère", "2803918263", "Odyssée");
        Book book4 = new Book(10, "Albert Camus", "2394827638", "L'Étranger");
        Book book5 = new Book(22, "Alexandre Dumas", "2253008885", "Les Trois Mousquetaires");
        Book book6 = new Book(22, "Caterina Mognato", "2253008885 ", "Les Trois Mousquetaires");

        Set books =new HashSet();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);

        Object obj = book5;
        System.out.println(obj.equals(book6));


    }
}
