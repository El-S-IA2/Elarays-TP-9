import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {


    @Test
    public void get() {
        Inventory inventaire = new Inventory();

        Book b1 = new Book(11, "Said", "DZAIUDZI763", "LEBG");
        Book b2 = new Book(18, "SaidElarays", "DZAIUDZI79993", "LEBOSS");
        Book b3 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");
        Book b4 = new Book(113, "Mohagdymed", "DZAUUUDIFZI763", "lehfd");

        inventaire.add(b1,5);
        inventaire.add(b2,9);
        inventaire.add(b3,0);
        inventaire.add(b3,3);

        assertEquals(5,inventaire.get(b1));
        assertEquals(9,inventaire.get(b2));
        assertEquals(3,inventaire.get(b3));
        assertEquals(0,inventaire.get(b4));
    }

    @org.junit.jupiter.api.Test
    void getAll() {
        Inventory inventaire = new Inventory();

        Book b1 = new Book(11, "Said", "DZAIUDZI763", "LEBG");
        Book b2 = new Book(18, "SaidElarays", "DZAIUDZI79993", "LEBOSS");
        Book b3 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");
        Book b4 = new Book(113, "Mohagdymed", "DZAUUUDIFZI763", "lehfd");

        inventaire.add(b1,5);
        inventaire.add(b2,9);
        inventaire.add(b3,0);
        inventaire.add(b3,5);


        assertEquals(3,inventaire.getAll().size());

    }

    @org.junit.jupiter.api.Test
    void add() {
        Inventory inventaire = new Inventory();

        Book b1 = new Book(11, "Said", "DZAIUDZI763", "LEBG");
        Book b2 = new Book(18, "SaidElarays", "DZAIUDZI79993", "LEBOSS");
        Book b3 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");
        Book b4 = new Book(113, "Mohagdymed", "DZAUUUDIFZI763", "lehfd");

        inventaire.add(b1,5);
        inventaire.add(b2,9);
        inventaire.add(b3,0);
        inventaire.add(b3,5);

        assertEquals(5, inventaire.get(b1));
        assertEquals(9, inventaire.get(b2));
        assertEquals(5, inventaire.get(b3));
    }

    @org.junit.jupiter.api.Test
    void remove() throws InventoryException {
        Inventory inventaire = new Inventory();

        Book b1 = new Book(11, "Said", "DZAIUDZI763", "LEBG");
        Book b2 = new Book(18, "SaidElarays", "DZAIUDZI79993", "LEBOSS");
        Book b3 = new Book(11, "Mohamed", "DZAUUUDZI763", "le");
        Book b4 = new Book(113, "Mohagdymed", "DZAUUUDIFZI763", "lehfd");

        inventaire.add(b1,5);
        inventaire.add(b2,9);
        inventaire.add(b3,5);

        inventaire.remove(b1,5);
        inventaire.remove(b2,1);
        inventaire.remove(b3,4);

        assertEquals(0, inventaire.get(b1));
        assertEquals(1, inventaire.get(b3));
        assertEquals(2, inventaire.getAll().size());
    }
}