package problem3;

public class Magazine extends Document {
    private final String month;
    private final int year;

    public Magazine(String title, String month, int year) {
        super(title);
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s, %s %d", super.toString(), month, year);
    }
}
