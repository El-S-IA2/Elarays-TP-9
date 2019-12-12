import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {

    public ArrayList<Entry> inventaire;

    public Inventory() {
        inventaire = new ArrayList<Entry>();
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

    public void add(Object e,int n) {

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
