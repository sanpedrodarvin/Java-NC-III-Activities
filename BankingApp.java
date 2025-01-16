import java.util.Scanner;
public class BankingApp{
    static UserAccount[] users = { new UserAccount(412435, 7452, "Chris Sandoval", 32000.0),
                            new UserAccount(264863, 1349, "Marc Yim", 1000)};

    public static void main(String[] args) {

        int id, pin;
        boolean isLogged = false;
        char newAccount;

        do {

            newAccount = 'N';

            System.out.print("Enter ID: ");
            id = Bank.in.nextInt();

            System.out.print("Enter Pin Code: ");
            pin = Bank.in.nextInt();

            for(UserAccount user : users)
            {
                if(user.getId() == id && user.getPin() == pin)
                {
                    System.out.println("Logged in.");
                    while (!isLogout(user));
                    System.out.println("Log-in new Account? Y/N");
                    newAccount = Bank.in.next().charAt(0);
                    if(newAccount == 'N')
                        isLogged = true;
                }
            }

            if(isLogged == false && newAccount == 'N')
                System.out.println("Invalid login. Try again");

        }while(isLogged == false);
    }

    public static boolean isLogout(UserAccount user)
    {
        int option = -1;
        while(option < 0 || option > 4)
        {
            System.out.println("Your account balance is: P" + user.getBalance());
            System.out.println("1. Deposit Cash-In");
            System.out.println("2. Money Transfer");
            System.out.println("3. Previous Transactions");
            System.out.println("4. Log-out");

            option = Bank.in.nextInt();
        }
        switch (option)
        {
            case 1:
                user.setBalance(user.getBalance() + user.deposit());
                break;
            case 2:
                System.out.print("Enter Account ID: ");
                int id = Bank.in.nextInt();
                for(UserAccount receivingUser : users)
                {
                    if(user.getId() == id)
                    {
                        System.out.println("You cannot transfer money on your own account.");
                        break;
                    }
                    else if(receivingUser.getId() == id)
                        user.moneyTransfer(receivingUser, user);
                }
                break;
            case 3:
                System.out.println("Feature will be available soon.");
                break;
            case 4:
                System.out.println("You have been logged out.");
                return true;
        }
        return false;
    }
}

class Bank {
    static Scanner in = new Scanner(System.in);
    public double deposit() {
        System.out.println("Enter amout to Cash in: ");
        return in.nextDouble();
    }
    public void moneyTransfer(UserAccount receivingUser, UserAccount user)
    {
        System.out.print("Enter amount to transfer + %1 charge: ");
        double transferAmount = Bank.in.nextDouble();
        receivingUser.setBalance(receivingUser.getBalance() + transferAmount);
        user.setBalance(user.getBalance() - (transferAmount * 1.01));
    }
    public void transactions() {}

}

class UserAccount extends Bank{
    private int id, pin;
    private String name;
    private double balance;

    public UserAccount(int id, int pin, String name, double balance)
    {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getId() { return  id; }
    public int getPin() { return pin; }
    public String getName() { return name; }
    public double getBalance(){ return  balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
