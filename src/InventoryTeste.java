import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class InventoryTeste {
    Inventory inventaire = new Inventory();

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
    }

    @Test
    void get() {


        assertEquals(5,inventaire.get(b1));
        assertEquals(9,inventaire.get(b2));
        assertEquals(3,inventaire.get(b3));
        assertEquals(0,inventaire.get(b4));
        assertEquals(10,inventaire.get(b5));
    }

    @Test
    void getAll() {
        assertEquals(4,inventaire.getAll().size());
    }

    @Test
    void add() {
        inventaire.add(b3,7);
        assertEquals(5, inventaire.get(b1));
        assertEquals(9, inventaire.get(b2));
        assertEquals(10, inventaire.get(b3));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(inventaire.getAll());
    }

    @Test
    void remove() throws InventoryException {
        inventaire.remove(b1,5);
        inventaire.remove(b2,1);
        inventaire.remove(b3,3);

        assertEquals(0, inventaire.get(b1));
        assertEquals(8, inventaire.get(b2));
        assertEquals(0, inventaire.get(b3));
        assertEquals(2, inventaire.getAll().size());
    }
}