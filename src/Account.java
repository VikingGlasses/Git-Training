
public class Account {
    private final  int ID;
    private Customer customer;
    private double  balance;
    
    public Account(int id, Customer customer, double balance){
        this.ID = id;
        this.customer = customer;
        this.balance = balance;
    }
    
    public Account(int id, Customer customer){
        this.ID = id;
        this.customer = customer;
    }
    
    public int getID(){
        return this.ID;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public String toString(){
        return "Name; " + customer.toString() + "\nBalance: " + this.balance; 
    }
    
    
}
