import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Book {

    private final String auteur,titre,ISBN;
    private final double prix;
    private ArrayList<String>tab=new ArrayList<>();


    public Book(double prix,String auteur,String ISBN,String titre) {
        if(tab.contains(ISBN)){ }
        this.prix=prix;
        this.auteur=auteur;
        this.ISBN=ISBN;
        if (ISBN !=null)
            tab.add(ISBN);
        this.titre=titre;
    }


    public String getISBN() {
        return ISBN;
    }
}
