import java.util.Scanner;
public class CompoundInterestCalculator {

    //Compound interest = P [ 1 + r/n]^nt
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double principalAmount;
        double interestRate;
        int noOftimesCompounded;
        int noOfYears;
        double compoundInterest;

        System.out.print("Enter the principal amount: ");
        principalAmount = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        interestRate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        noOftimesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        noOfYears = scanner.nextInt();

        compoundInterest = principalAmount * Math.pow( 1 + interestRate / noOftimesCompounded, noOftimesCompounded * noOfYears);

        System.out.printf("The amount after %d years is $%.2f", noOfYears, compoundInterest);

        scanner.close();
    }
}
