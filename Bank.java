import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.users = new ArrayList<>();
    }

    public void addUser(   String password,
                           String fullName,
                           String aadress,
                           String phoneNumber,
                           String email,
                           String secretQuestion,
                           String answerForSecretQuestion) {

        User user = new User(password, fullName, aadress, phoneNumber, email, secretQuestion, answerForSecretQuestion);
        users.add(user);
    }

    public void addUser (User user) {           //user already exist, we want to move the user to our bank (for ex from another branch)
        users.add(user);
    }

    public Double totalAmountOfMoney (String userId) {
        for (User user: users) {
            if (userId.equals(userId)){
                return user.totalAmountOfMoney();
            }
        }
        return null;
    }

    public void addMoneyToUser (String userId, long accountId, double amountOfMoney) {
        for (User user: users) {
            if (userId.equals(user.getId())){
                user.addMoneyToAccount(accountId, amountOfMoney);
                return;
            }
        }
    }

    public void withdrawMoneyFromUser (String userId, long accountId, double amountOfMoney) {
        for (User user: users) {
            if (userId.equals(user.getId())){
                user.withdrawMoneyFromAccount(accountId, amountOfMoney);
                return;
            }
        }
    }

    public void addNewAccount (String userId, String currency) {
        for (User user: users) {
            if (userId.equals(user.getId())){
                user.addNewAccount(currency);
                return;
            }
        }
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "users=" + users +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
