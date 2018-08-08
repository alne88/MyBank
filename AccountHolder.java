public abstract class AccountHolder {

    protected String name;

    protected Account account;

    public abstract void addMoney(double money);

    public abstract void withdrawMoney(double money);

    public abstract double getBalance();


}
