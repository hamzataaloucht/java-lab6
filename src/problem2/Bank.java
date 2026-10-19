package problem2;

import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) != null) {
            return false;
        }
        customers.add(new Customer(customerName));
        return true;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            return false;
        }
        customer.addTransaction(amount);
        return true;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);
        if (customer == null) {
            System.out.println("Customer not found");
            return;
        }

        double balance = 0;

        System.out.println("Statement for " + customerName + " at " + name);
        for (double transaction : customer.getTransactions()) {
            if (transaction >= 0) {
                System.out.printf("Credit: %.2f%n", transaction);
            } else {
                System.out.printf("Debit: %.2f%n", transaction);
            }
            balance += transaction;
        }

        System.out.printf("Balance: %.2f%n", balance);
    }
}
