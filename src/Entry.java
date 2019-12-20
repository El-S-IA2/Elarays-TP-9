public class Entry {

    /**
     * Champs de la classe Entry
     */
    private final Object first;
    private int second;

    /**
     * Constructeur de la classe Entry
     * @param e Le 1er élement du couple
     * @param quantite Le 2éme élement du couple
     */
    public Entry(Object e, int quantite) {
        this.first = e;
        this.second = quantite;
    }

                                            //// Getter and Setter ////

    public Object getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }


    public void setSecond(int quantite) {
            this.second += quantite;
    }

}
