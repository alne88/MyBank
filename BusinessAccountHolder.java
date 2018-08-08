public class BusinessAccountHolder extends AccountHolder {

    public BusinessAccountHolder (String name, Currency currency) {
        this.name = name;
        this.account = new Account(currency);
    }

    @Override
    public void addMoney(double money) {
        this.account.addMoney(money);
    }

    @Override
    public void withdrawMoney(double money) {
        this.account.withdrawMoney(money * 1.03);               //withdraw fee 3%
    }

    @Override
    public double getBalance() {
        return this.account.getBalance();
    }

    @Override
    public String toString() {
        return "BusinessAccountHolder{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
