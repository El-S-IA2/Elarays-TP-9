import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookStoreTest {


    Inventory inventaire = new Inventory();
    Inventory inventaire2 = new Inventory();
    BookStore stock = new BookStore();

    Book b1 = new Book(11, "Said", "DZAIUDZI763", "LEBG");
    Book b2 = new Book(18, "SaidElarays", "DZAIUDZI79993", "LEBOSS");
    Book b3 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");
    Book b4 = new Book(113, "Mohagdymed", "DZAUUUDIFZI763", "lehfd");
    Book b5 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");

    @BeforeEach
    void setUp() {
        inventaire.add(b1,5);
        inventaire.add(b2,9);
        inventaire.add(b3,0);
        inventaire.add(b3,3);
        inventaire.add(b5,10);

        inventaire2.add(b1,3);
        inventaire2.add(b2,9);
        inventaire2.add(b5,1);
    }

    @Test
    void restock() {
        stock.restock(inventaire);
        assertEquals(3, stock.getAll().size());
        assertEquals(13, stock.get(b5));
        assertEquals(13, stock.get(b3));

    }

    @Test
    void sell() {

        stock.restock(inventaire);
        stock.sell(inventaire2);

        assertEquals(2, stock.get(b1));
        assertEquals(12, stock.get(b5));
        assertEquals(2, stock.getAll().size());
    }

    @Test
    void get() {
    }

    @Test
    void getAll() {
    }
}