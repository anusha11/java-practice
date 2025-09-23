import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        int choice;
        boolean isRunning = true;
        double balance = 0;

        while (isRunning){
            System.out.println("*****************");
            System.out.println(" BANKING PROGRAM ");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid input!!");
            }
        }
        System.out.println("*****************************");
        System.out.println("THANK YOU, HAVE A NICE DAY!!");
        System.out.println("*****************************");
        scanner.close();
    }

    //SHOW BALANCE
    static void showbalance(double balance){
        System.out.println("*****************");
        System.out.printf("$%.2f\n",balance);
    }

    //RETURN DEPOSIT AMOUNT
    static double deposit(){
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();
        if (amount < 0){
            System.out.println("AMOUNT CANNOT BE NEGATIVE!!");
            return 0;
        }else{
            return amount;
        }
    }

    //RETURN WITHDRAW AMOUNT
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.println("AMOUNT CANNOT BE NEGATIVE!!");
            return 0;
        }else if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!!");
            return 0;
        }else{
            return amount;
        }
    }
}
