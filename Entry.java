public class Entry {

    private final Book first;
    private int second;

    public Entry(Book e, int quantite) {
        this.first = e;
        this.second = quantite;
    }

    public Book getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }


    public void setSecond(int quantite) {
            this.second += quantite;
    }

}
