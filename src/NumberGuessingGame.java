import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args){

        int randomNumber;
        int guessedNumber;
        int attempts =0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        randomNumber = random.nextInt(0, 101);

        do {
                System.out.print("Guess the number between 1 - 100: ");
                guessedNumber = scanner.nextInt();
                attempts++;
                if(!(guessedNumber >= 0 && guessedNumber <=100)){
                    System.out.println("Please enter the number between 1 - 100!!!");
                }else if (guessedNumber < randomNumber) {
                    System.out.println("Too LOW!!, Please try again!");
                } else if (guessedNumber > randomNumber) {
                    System.out.println("Too HIGH!!, Please try again!");
                }
        }while(!(randomNumber == guessedNumber));

        System.out.println("Congratulations, You Won!!. You guessed in " + attempts + " attempts!");
        scanner.close();
    }
}
