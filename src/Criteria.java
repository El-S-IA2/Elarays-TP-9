import java.util.Comparator;

/**
 * une énumération Criteria
 */

public enum Criteria {


    AUTHOR,

    TITLE,

    PRICE;


    /**
     * Trier les livres selon différents critères : par auteur, titre ou prix.
     * @param b Si le booléen est vrai, le comparateur compare les livres par ordre croissant,
     *          Sinon par ordre décroissant.
     * @return  Un comparateur de livre associé au critère courant.
     */
    public Comparator<Book> getComparator(boolean b) {
        if (b) {
            switch (this) {
                case TITLE:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            if (book1.getTitre() != null && book2.getTitre() != null) {
                                return book1.getTitre().compareTo(book2.getTitre());
                            } else if (book1.getTitre() != null) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    };
                case PRICE:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            return Double.compare(book1.getPrix(), book2.getPrix());
                        }
                    };
                case AUTHOR:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            if (book1.getAuteur() != null && book2.getAuteur() != null) {
                                return book1.getAuteur().compareTo(book2.getAuteur());
                            } else if (book1.getAuteur() != null) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    };
            }
        }
        else {
            switch (this) {
                case TITLE:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            if (book1.getTitre() != null && book2.getTitre() != null) {
                                return book2.getTitre().compareTo(book1.getTitre());
                            } else if (book1.getTitre() != null) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    };
                case PRICE:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            return Double.compare(book2.getPrix(), book1.getPrix());
                        }
                    };
                case AUTHOR:
                    return new Comparator<Book>() {
                        @Override
                        public int compare(Book book1, Book book2) {
                            if (book1.getAuteur() != null && book2.getAuteur() != null) {
                                return book2.getAuteur().compareTo(book1.getAuteur());
                            } else if (book1.getAuteur() != null) {
                                return 1;
                            } else {
                                return -1;
                            }
                        }
                    };
            }
        }
        return null;
    }
}