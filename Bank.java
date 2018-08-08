import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<AccountHolder> accounts;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public void addUser(String name, Currency currency) {
        accounts.add(new UserAccountHolder(name, currency));
    }

    public void addBusiness(String name, Currency currency) {
        accounts.add(new BusinessAccountHolder(name, currency));
    }

    public void addFund(String name, Currency currency) {
        accounts.add(new FundAccountHolder(name, currency));
    }


    public void addMoney (String name, double amountOfMoney) {
        for (AccountHolder user: accounts) {
            if (name.equals(user.name)){
                user.addMoney(amountOfMoney);
                return;
            }
        }
    }

    public void withdrawMoney (String name, double amountOfMoney) {
        for (AccountHolder user: accounts) {
            if (name.equals(user.name)){
                user.withdrawMoney(amountOfMoney);
                return;
            }
        }
    }

        public Double balanceOfUser (String name) {
        for (AccountHolder user: accounts) {
            if (name.equals(user.name)){
                return user.getBalance();
            }
        }
        return null;
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + accounts +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
