package problem3;

public class Book extends Document {
    protected final String author;
    protected final int nbrPages;

    public Book(String title, String author, int nbrPages) {
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    @Override
    public String toString() {
        return String.format("%s by %s, %d pages", super.toString(), author, nbrPages);
    }
}
