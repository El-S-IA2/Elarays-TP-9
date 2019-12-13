import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BookStore {

    Inventory inventaire = new Inventory();

    public void restock(Inventory inventaireLivre){

    }

    public void sell(Inventory inventaireLivre) {


    }

    public int get(Book livre) {
        return inventaire.get(livre);
    }

    public ArrayList<Object> getAll(){
        return inventaire.getAll();
    }

}
