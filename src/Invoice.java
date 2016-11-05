
public class Invoice {

    private final int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCostumer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double getAmountAfterDiscount() {
        return (this.amount * (1.0 - (customer.getDiscount() * 0.01)));
    }

}
