import java.util.*;

public class Inventory {

    /**
     * Entrée de l’inventaire : couple composé d’un élément et de la quantité qui lui est associée
     */
    private List <Entry> inventaire;

    /**
     * Consructeur de Inventory
     */
    public Inventory() {
        inventaire = new ArrayList<Entry>();
    }

    /**
     * getter de inventaire
     * @return inventaire
     */
    public List<Entry> getInventaire() {
        return inventaire;
    }

    /**
     * Methode get : indique la quantité associée à l’élément e
     * Si l'element n'existe pas alors on renvoie 0
     * @param e l'element à rechercher
     * @return la quantitée associée
     */
    public int get(Object e){
        Iterator<Entry> it= inventaire.iterator();
        while(it.hasNext()) {
            Entry couple = it.next();
            if (couple.getFirst()==e) {
                return couple.getSecond();
            }
        }
        return 0;
    }


    /**
     * Renvoie la liste des éléments présents dans l’inventaire, C.A.D  la quantitée associée est non nulle.
     * @return Une liste d'objets
     */
    public List<Object> getAll(){
        List <Object> listeElements = new ArrayList<Object>() ;
        Iterator<Entry> it= inventaire.iterator();
        while(it.hasNext()) {
            Entry couple = it.next();
            if (couple.getSecond()>0) {
                listeElements.add(couple.getFirst());
            }
        }
        return listeElements;
    }


    /**
     * Ajoute dans l’inventaire l’élément e en quantité n.
     * Si n est négatif, on lance une exception IllegalArgumentException.
     * Si l’élément était déjà présent, on augmente la quantité associée.
     * @param e L'objet à ajouter
     * @param n la quantitée à augmenter
     */
    public void add(Object e,int n) {

        if (n < 0) {
            throw new IllegalArgumentException("ERREUR : n < 0");
        }
        if (n > 0) {
            if (inventaire.size() == 0) {
                inventaire.add(new Entry(e, n));
            }

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


    /**
     * Retire de l’inventaire l’élément e en quantité n.
     * Si n est négatif, on lance une exception IllegalArgumentException.
     * @param e l'objet à retirer
     * @param n La quantitée à retirer
     * @throws InventoryException est lancé Si on tente de retirer plus d’éléments que l’inventaire n’en contient
     */
    public void remove (Object e, int n) throws InventoryException {
        if (n < 0) {
            throw new IllegalArgumentException("ERREUR : n < 0");}

        int len = inventaire.size();
        for (int i = 0; i < inventaire.size(); i++) {
            if (inventaire.get(i).getFirst() == e) {
                if (inventaire.get(i).getSecond()<n) {
                    throw new InventoryException("ERREUR : n > la quantitée présente dans l'inventaire");
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
