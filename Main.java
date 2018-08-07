import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("World Bank of Lots of Money");
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Welcome to " + bank.getBankName() + " bank!");
            System.out.println("Choose your action:");
            System.out.println("1 - create new user;");
            System.out.println("2 - create new account;");
            System.out.println("3 - add money to selected account of your user;");
            System.out.println("4 - withdraw money from users account;");
            System.out.println("5 - check total amount of money of your user");
            System.out.println("6 - Print bank");
            System.out.println("0 - Exit");
            int userOption = scanner.nextInt();
            System.out.println();

            switch (userOption) {
                case 1:
                    System.out.println("For creating a new user, set a password: ");
                    String password = scanner.next();

                    System.out.println("Full name: ");
                    String fullName = scanner.next();

                    System.out.println("Aadress: ");
                    String aadress = scanner.next();

                    System.out.println("Phone number: ");
                    String phoneNumber = scanner.next();

                    System.out.println("E-mail: ");
                    String email = scanner.next();

                    System.out.println("For retrieving the user when you lose your password, give us a secret question: ");
                    String secretQuestion = scanner.next();

                    System.out.println("And now what's the answer to this question: ");
                    String answerForSecretQuestion = scanner.next();
                    bank.addUser(password, fullName, aadress, phoneNumber, email, secretQuestion, answerForSecretQuestion);

                    System.out.println("Congratulations, you have successfully created a new user");
                    break;

                case 2:
                    System.out.println("Enter user Id: ");
                    String userId1 = scanner.next();
                    System.out.println("What currency would the account be: ");
                    String currency = scanner.next();
                    bank.addNewAccount(userId1, currency);
                    break;

                case 3:
                    System.out.println("Enter user Id: ");
                    String userId2 = scanner.next();
                    System.out.println("Enter account number: ");
                    long accountNumber = scanner.nextLong();
                    System.out.println("How much money would you like to add: ");
                    double amountOfMoney = scanner.nextDouble();
                    bank.addMoneyToUser(userId2, accountNumber, amountOfMoney);
                    System.out.println("Account balance is: " + bank.totalAmountOfMoney(userId2));
                    break;

                case 4:
                    System.out.println("Enter user Id: ");
                    String userId3 = scanner.next();
                    System.out.println("Enter account number: ");
                    long accountNumber1 = scanner.nextLong();
                    System.out.println("How much money would you like to withdraw: ");
                    double amountToWithdraw = scanner.nextDouble();
                    bank.withdrawMoneyFromUser(userId3, accountNumber1, amountToWithdraw);
                    System.out.println("Account balance is: " + bank.totalAmountOfMoney(userId3));
                    break;

                case 5:
                    System.out.println("Enter user ID: ");
                    String userId4 = scanner.next();
                    System.out.println(bank.totalAmountOfMoney(userId4));
                    break;

                case 6:
                    System.out.println(bank);
                    break;

                case 0:
                    return;

                default:
                    break;
            }
        }
    }

}
