package problem3;

public class Document {
    private static int counter = 0;
    protected final int numRec;
    protected final String title;

    public Document(String title) {
        this.title = title;
        this.numRec = ++counter;
    }

    public int getNumRec() {
        return numRec;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("#%d - %s", numRec, title);
    }
}
