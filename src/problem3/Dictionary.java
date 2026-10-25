package problem3;

public class Dictionary extends Document {
    private final String language;

    public Dictionary(String title, String language) {
        super(title);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return String.format("%s, language: %s", super.toString(), language);
    }
}
