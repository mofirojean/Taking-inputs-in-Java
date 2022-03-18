public class CreditCard {
    // instance variables
    private String customer;    // name of customer ("John Steve")
    private String bank;        // name of the bank ("AfriLand first bank")
    private String account;     // account identifier ("12324 124124 64646 79")
    private int limit;          // credit limit (measured in dollars)
    protected double balance;   // current balance (measured in dollars)

    // constructors
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust, bk, acnt, lim, 0.0);
    }

    // Accessor methods
    public String getCustomer(){
        return customer;
    }
    public String getBank(){
        return bank;
    }
    public String getAccount(){
        return account;
    }
    public int getLimit() {
        return limit;
    }
    public double getBalance() {
        return balance;
    }

    // update method
    public boolean charge(double price){    // make a charge
        if ((price + balance) > limit){     // if charge would surpass limits
            return false;                   // refuse charge
        }
        // at this point, the charge is successful
        balance += price;
        return true;
    }

    public void makePayment(double amount){
        balance -= amount; // make a payment
    }

    // Utility method to print a card's information
    public  static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit);     // implicit cast
    }
}
