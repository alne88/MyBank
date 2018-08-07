import java.util.List;

public class Bank {

    List<User> users;
    String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addNewUser(String password,
                           String fullName,
                           String aadress,
                           String phoneNumber,
                           String email,
                           String secretQuestion,
                           String answerForSecretQuestion) {

        User newUser = new User(password, fullName, aadress, phoneNumber, email, secretQuestion, answerForSecretQuestion);
        users.add(newUser);
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
            }
        }
    }

}
