public class Entry {

    private final Object first;
    private int second;

    public Entry(Object e, int quantite) {
        this.first = e;
        this.second = quantite;
    }

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
