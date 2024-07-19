import java.util.*;
public class Task3 {
    static Scanner sc = new Scanner(System.in);
    int accountBalance;
    static String userName="UTKARSH_RAI";
    static int pin=2210;

    public void deposit(int amount){
        accountBalance+=amount;
        System.out.println("Transaction Complete");
        return;
    }
    public void showBalance(){
        System.out.println(accountBalance);
        System.out.println("Transaction Complete");
        return;
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=accountBalance){
        accountBalance-=amount;
        System.out.println("Transaction Complete");
        }
        else{
            System.out.println("Withdrawl amount is either zero or greater then bank balance");
        }
        return;
    }

    public void displayMenu() {
        System.out.println("\n===== ATM Menu =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    System.out.println("Enter amount for depositing");
                    int s= sc.nextInt();
                    deposit(s);
                    break;
                case 3:
                    System.out.println("Enter amount for widthdraw");
                    int a= sc.nextInt();
                    withdraw(a);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Task3 atm= new Task3();
        System.out.println("Enter user name");
        String gc=sc.nextLine();
        System.out.println("Enter Your Pin");
        int vc = sc.nextInt();
        if(gc.equals(userName) && pin==vc){
            atm.run();
        }
        else{
            System.out.println("username or password is wrong");
        }
        
    }
}
