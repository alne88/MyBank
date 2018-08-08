public class FundAccountHolder extends AccountHolder {

    public FundAccountHolder (String name, Currency currency) {
        this.name = name;
        this.account = new Account(currency);
    }

    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money);
    }

    @Override
    public double getBalance() {
        return this.account.getBalance();
    }

    @Override
    public String toString() {
        return "FundAccountHolder{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
