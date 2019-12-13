import java.util.*;

public class Inventory {

    public List<Entry> inventaire;

    public Inventory() {
        inventaire = new ArrayList<Entry>();

        /*Book book1 = new Book(15, "Chinua Achebe", "0292107315", "Le monde s'effondre");
        Book book2 = new Book(20, "Miguel de Cervantes", "8964730182", "Don Quichotte");
        Book book3 = new Book(19, "Homère", "2803918263", "Odyssée");
        Book book4 = new Book(10, "Albert Camus", "2394827638", "L'Étranger");
        Book book5 = new Book(22, "Alexandre Dumas", "2253008885", "Les Trois Mousquetaires");
        Book book6 = new Book(22, "Caterina Mognato", "2253008885", "Les Trois Mousquetaires");

        add(book1,5);
        add(book2,5);
        add(book3,5);
        add(book4,5);
        add(book5,5);
        add(book6,5);*/


    }

    public int get(Object n){
        Iterator<Entry> it= inventaire.iterator();
        while(it.hasNext()) {
            Entry couple = it.next();
            if (couple.getFirst()==n) {
                return couple.getSecond();
            }
        }
        return 0;
    }



    public ArrayList<Object> getAll(){
        ArrayList<Object> listeElements = new ArrayList<>();

        Iterator<Entry> it= inventaire.iterator();
        while(it.hasNext()) {
            Entry couple = it.next();
            if (couple.getSecond()>0) {
                listeElements.add(couple.getFirst());
            }
        }

        return listeElements;

    }

    public void add(Book e,int n) {

        if (n < 0) {
            throw new IllegalArgumentException("n negatif");
        }

        if (n > 0) {

            if (inventaire.size() == 0)
                inventaire.add(new Entry(e, n));

            else {
                int len = inventaire.size();
                boolean trouve = false;
                for (int i = 0; i < len; i++) {
                    if (inventaire.get(i).getFirst() == e) {
                        inventaire.get(i).setSecond(n);
                        trouve = true;
                    }
                    if (inventaire.get(i).getFirst().getISBN() == e.getISBN()) {
                        e = inventaire.get(i).getFirst();
                        inventaire.get(i).setSecond(1);
                        trouve = true;
                    }

                }
                if (!trouve)
                    inventaire.add(new Entry(e, n));
            }
        }
    }


    public void remove (Object e,int n) throws InventoryException {
        if (n < 0) {
            throw new IllegalArgumentException("n negatif");}

        int len = inventaire.size();
        for (int i = 0; i < inventaire.size(); i++) {
            if (inventaire.get(i).getFirst() == e) {
                if (inventaire.get(i).getSecond()<n) {
                    throw new InventoryException("n superieur");
                }
                if (inventaire.get(i).getSecond()==n) {
                    inventaire.remove(i);
                }
                else {
                    inventaire.get(i).setSecond(-n);
                }
            }
        }
    }




}
