
import static java.lang.Math.round;

public class Account {

    private final int ID;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.ID = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.ID = id;
        this.customer = customer;
    }

    public int getID() {
        return this.ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Name; " + customer.toString()
                + "\nBalance: " + round(this.balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        Account out = new Account(this.ID, this.customer);
        out.balance = this.balance + amount;
        return out;
    }

    public Account withraw(double amount) {
        Account out = new Account(this.ID, this.customer);
        if (this.balance >= amount){
        out.setBalance(this.balance - amount);
        } else {
            out.setBalance(balance);
            System.out.println("amount withrawn exceeds the current balance!");
        }
        return out;
    }

}
