import com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages_zh_CN;

public class UserAccountHolder implements AccountHolder {

    // user can have regular account + pension account.
    Account regular;
    Account pension;
    String email;

    public UserAccountHolder (String email, Currency currency) {
        this.email = email;
        this.regular = new Account(currency);
        this.pension = new Account(currency);
    }

    @Override
    public void addMoney(double money) {
            this.regular.addMoney(money*0.9);
            this.pension.addMoney(money*0.1);
    }

    @Override
    public void withdrawMoney(double money) throws Exception {
        if (regular.getBalance() < 100) {
           throw new Exception("Balance is less than 100");
        }
        if (regular.getBalance() < money) {
           throw new Exception("Not enough money on account");
        }
        this.regular.withdrawMoney(money);
    }

    @Override
    public String getUniqueIdentifier() {
        return email;
    }

    @Override
    public String toString() {
        return "UserAccountHolder{" +
                "regular=" + regular +
                ", pension=" + pension +
                ", email='" + email + '\'' +
                '}';
    }
}
