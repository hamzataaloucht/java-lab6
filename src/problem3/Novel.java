package problem3;

public class Novel extends Book {
    private final double price;

    public Novel(String title, String author, int nbrPages, double price) {
        super(title, author, nbrPages);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, price: %.2f", super.toString(), price);
    }
}
