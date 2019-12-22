
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class BookStore {


    //ArrayList<Book> stockTotal = new ArrayList <Book>();
    private Map <Book , Integer> stockTotal = new HashMap<>();

    public Map<Book, Integer> getStockTotal() {
        return stockTotal;
    }

    public void restock(Inventory inventaireLivre) {
        for (int i = 0; i < inventaireLivre.getAll().size(); i++) {
            Object res = inventaireLivre.getInventaire().get(i).getFirst();
            if (stockTotal.containsKey(res)) {
                stockTotal.replace((Book) res, stockTotal.get(res) + inventaireLivre.get(res));
            } else stockTotal.put((Book) res, inventaireLivre.get(res));
        }
    }




    public void sell(Inventory inventaireLivre) {
        for (int i=0;i < inventaireLivre.getAll().size() ; i++){
            Object res=inventaireLivre.getInventaire().get(i).getFirst();
            if (stockTotal.containsKey(res)) {
                if(stockTotal.get(res) - inventaireLivre.get(res)==0){
                    stockTotal.remove(res);
                }
                stockTotal.replace((Book) res, stockTotal.get(res) - inventaireLivre.get(res));
            }
        }
    }

    public int get(Book livre) {
            if (stockTotal.containsKey(livre)){
                return stockTotal.get(livre);
            }
            return 0;
    }

   public List <Book> getAll() {
       return new ArrayList<>(stockTotal.keySet());
   }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Book, Integer> entry : stockTotal.entrySet()) {

            sb.append(entry.getKey()  +  "'"  +  " → "   +  "'" + entry.getValue() + "'" +" \n");
        }
        return sb.toString();
    }

}
