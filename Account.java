public class Account {

    private double balance;
    private long accountNumber;
    private Currency currency;

    public Account(Currency currency) {
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

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void addMoney (double amountOfMoney) {
        this.balance += amountOfMoney;
    }

    public void withdrawMoney (double amountOfMoney) {
        if (balance < amountOfMoney) {
            System.out.println("Insufficient funds, cannot comply");
        } else {
            this.balance -= amountOfMoney;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", currency='" + currency + '\'' +
                '}';
    }
}
