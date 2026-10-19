package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("UM6P Bank");

        System.out.println("Add Ali: " + bank.addCustomer("Ali"));
        System.out.println("Add Sara: " + bank.addCustomer("Sara"));

        System.out.println("Add Ali again: " + bank.addCustomer("Ali"));

        bank.addTransaction("Ali", 500);
        bank.addTransaction("Ali", -120.50);
        bank.addTransaction("Ali", 75);

        bank.addTransaction("Sara", 1000);
        bank.addTransaction("Sara", -250);

        System.out.println("Add transaction for Omar: " + bank.addTransaction("Omar", 20));

        System.out.println();

        bank.printStatement("Ali");
        System.out.println();
        bank.printStatement("Sara");
        System.out.println();
        bank.printStatement("Omar");
    }
}
