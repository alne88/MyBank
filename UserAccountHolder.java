public class UserAccountHolder extends AccountHolder {

    public UserAccountHolder (String name, Currency currency) {
        this.name = name;
        this.account = new Account(currency);
    }

    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money * 1.05);           //withdraw fee 5%
    }

    @Override
    public double getBalance() {
        return this.account.getBalance();
    }

    @Override
    public String toString() {
        return "UserAccountHolder{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
