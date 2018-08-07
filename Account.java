import java.util.Random;

public class Account {

    private double balance;
    private long accountNumber;
    private String currency;
    User owner;

    public Account(String currency) {
        this.balance = 0;
        this.accountNumber = 10000000 + (long) (Math.random() * 10000000L);
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public void addMoney (double amountOfMoney) {
        this.balance += amountOfMoney;
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                ", owner=" + owner +
                '}';
    }
}
