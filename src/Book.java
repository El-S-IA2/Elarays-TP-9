
public class Book {

    /**
     * Champs constants
     */
    private final String auteur,titre,ISBN;
    private final double prix;

    /**
     * Constructeur de la classe Book
     * @param prix le prix du livre (en int)
     * @param auteur l'auteur du livre (en str)
     * @param ISBN l'ISBN du livre (en str)
     * @param titre le titre du livre (en str)
     */
    public Book(double prix,String auteur,String ISBN,String titre) {
        this.prix=prix;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.titre=titre;
    }

    /**
     * redéfinition de la methode toString pour Book
     * @return l'ensemble des infos d'un livre
     */
    @Override
    public String toString() {
        return " auteur : " + auteur +
                " , titre : " + titre +
                " , ISBN : " + ISBN +
                " , prix : " + prix + "\n";
    }

    /**
     * redéfinition de la methode equals , 2 livres == si ISBN == .
     * @param o l'objet o
     * @return true ou false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN.equals(book.ISBN);
    }

    /**
     * redéfinition de la methode hachCode
     * @return un hachCode
     */
    @Override
    public int hashCode() {
        int hash = 10;
        hash = 31 + hash + this.ISBN.hashCode();
        return hash;
    }



                                    //// Getter ////

    public String getISBN() {
        return ISBN;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public double getPrix() {
        return prix;
    }
}

