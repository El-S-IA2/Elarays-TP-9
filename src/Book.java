public class Book {

    private final String auteur,titre,ISBN;
    private final double prix;

    public Book(double prix,String auteur,String ISBN,String titre) {
        this.prix=prix;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.titre=titre;
    }
}
