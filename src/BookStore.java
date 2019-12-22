
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe BookStore qui represente une librairie  avec  un stock de livres qu’elle met en vente.
 */
public class BookStore {

    /**
     * Dictionnaire qui represente ce stock ,
     * key = un livre (en Book),
     * value = la quantitée associée (en Int),
     */
    private Map <Book , Integer> stockTotal = new HashMap<>();


    /**
     * réapprovisionner le stock d’une libraire
     * @param inventaireLivre un inventaire de livres.
     */
    public void restock(Inventory inventaireLivre) {
        for (int i = 0; i < inventaireLivre.getAll().size(); i++) {
            Book objCourant = (Book) inventaireLivre.getInventaire().get(i).getFirst();
            if (stockTotal.containsKey(objCourant)) {
                stockTotal.replace( objCourant, stockTotal.get(objCourant) + inventaireLivre.get(objCourant));
            }
            else {
                stockTotal.put( objCourant, inventaireLivre.get(objCourant));
            }
        }
    }


    /**
     * à chaque fois que des livres sont vendus,
     * @param inventaireLivre un inventaire de livres.
     */
    public void sell(Inventory inventaireLivre) {
        for (int i=0;i < inventaireLivre.getAll().size() ; i++){
            Book objCourant= (Book) inventaireLivre.getInventaire().get(i).getFirst();
            if (stockTotal.containsKey(objCourant)) {
                if(stockTotal.get(objCourant) - inventaireLivre.get(objCourant)==0){
                    stockTotal.remove(objCourant);
                }
                else {
                    stockTotal.replace( objCourant, stockTotal.get(objCourant) - inventaireLivre.get(objCourant));
                }
            }
        }
    }

    /**
     * Methode get : indique la quantité associée au Book livre
     * Si l'element n'existe pas alors on renvoie 0
     * @param livre Le livre à rechercher
     * @return la quantitée associée
     */
    public int get(Book livre) {
            if (stockTotal.containsKey(livre)){
                return stockTotal.get(livre);
            }
            return 0;
    }


    /**
     *Renvoie la liste des livres présents dans l’inventaire, C.A.D  la quantitée associée est non nulle.
     * @return Une liste de livres
     */
   public List <Book> getAll() {
       return new ArrayList<>(stockTotal.keySet());
   }

    /**
     *redéfinition de la methode toString pour Bookstore
     * @return l'ensemble des infos d'un stock
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Book, Integer> entry : stockTotal.entrySet()) {

            sb.append(entry.getKey()  +  "'"  +  " → "   +  "'" + entry.getValue() + "'" +"\n");
        }
        return sb.toString();
    }

}
