package problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the capacity of the library: ");
        int n = scan.nextInt();
        scan.nextLine();

        Library library = new Library(n);
        library.add(new Novel("The Alchemist", "Paulo Coelho", 208, 99.90));
        library.add(new Dictionary("Larousse", "French"));

        int choice;

        do {
            System.out.println("1. Add a document");
            System.out.println("2. Display documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Find a document");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Type (1. Novel, 2. Textbook, 3. Magazine, 4. Dictionary): ");
                    int type = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Title: ");
                    String title = scan.nextLine();

                    Document doc;
                    if (type == 1 || type == 2) {
                        System.out.print("Author: ");
                        String author = scan.nextLine();
                        System.out.print("Number of pages: ");
                        int nbrPages = scan.nextInt();
                        scan.nextLine();

                        if (type == 1) {
                            System.out.print("Price: ");
                            double price = scan.nextDouble();
                            scan.nextLine();
                            doc = new Novel(title, author, nbrPages, price);
                        } else {
                            System.out.print("Level: ");
                            doc = new Textbook(title, author, nbrPages, scan.nextLine());
                        }
                    } else if (type == 3) {
                        System.out.print("Month: ");
                        String month = scan.nextLine();
                        System.out.print("Year: ");
                        int year = scan.nextInt();
                        scan.nextLine();
                        doc = new Magazine(title, month, year);
                    } else {
                        System.out.print("Language: ");
                        doc = new Dictionary(title, scan.nextLine());
                    }

                    System.out.println("Added: " + library.add(doc));
                }
                case 2 -> library.displayDocuments();
                case 3 -> {
                    System.out.print("Record number: ");
                    int numRec = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Deleted: " + library.delete(library.document(numRec)));
                }
                case 4 -> {
                    System.out.print("Record number: ");
                    int numRec = scan.nextInt();
                    scan.nextLine();
                    Document doc = library.document(numRec);
                    System.out.println(doc == null ? "Document not found" : doc);
                }
                case 5 -> library.displayAuthors();
            }

            System.out.println();
        } while (choice != 0);

        scan.close();
    }
}
