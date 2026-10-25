package problem3;

import java.util.ArrayList;

public class Library {
    private final int capacity;
    private final ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public void displayDocuments() {
        for (Document doc : documents) {
            System.out.println(doc);
        }
    }

    public boolean add(Document doc) {
        if (documents.size() >= capacity || documents.contains(doc)) {
            return false;
        }
        documents.add(doc);
        return true;
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numRec) {
        for (Document doc : documents) {
            if (doc.getNumRec() == numRec) {
                return doc;
            }
        }
        return null;
    }

    public void displayAuthors() {
        for (Document doc : documents) {
            if (doc instanceof Book book) {
                System.out.println(book.getAuthor());
            }
        }
    }
}
