import java.util.Scanner;

public class ExtendedCalculator {

    public static void main(String[] args){

        double firstNumber;
        double secondNumber;
        char operator;
        double total = 0.0;
        boolean isValidOutput = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch (operator){
            case '+' -> total = firstNumber + secondNumber;
            case '-' -> total = firstNumber - secondNumber;
            case '*' -> total = firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber == 0){
                    System.out.println("\nCannot divide by Zero!!☹️");
                    isValidOutput = false;
                }else{
                    total = firstNumber / secondNumber;
                }
            }
            case '^' -> total = Math.pow(firstNumber, secondNumber);
            default -> {
                System.out.println("Not a valid operator!!😡");
                isValidOutput = false;
            }

        }

        if(isValidOutput){
            System.out.printf("The calculated value is %.2f", total);
        }
        scanner.close();
    }
}
