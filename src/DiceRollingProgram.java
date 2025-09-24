import java.util.Random;
import java.util.Scanner;

public class DiceRollingProgram {

    static int noOfDice;
    static boolean isNumofDiceRollNegative = true;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int randomNumber;
        int result = 0;
        Random random = new Random();
        noOfDice = acceptInput();

        for (int i=0; i<noOfDice; i++){
            randomNumber = random.nextInt(1,7);
            rolldice(randomNumber);
            System.out.println("You rolled: " + randomNumber);
            result += randomNumber;
        }
        System.out.println("Total: " + result);
        scanner.close();
    }

    //Accept user input
    static int acceptInput(){
        while (isNumofDiceRollNegative){
            System.out.print("Enter the # of dice to roll: ");
            noOfDice = scanner.nextInt();
            if(noOfDice <= 0) {
                System.out.println("Try again! Please enter positive numbers!!");
            }else{
                isNumofDiceRollNegative = false;
            }
        }
        return noOfDice;
    }

    //Roll dice
    static void rolldice(int randomNumber){

        String one = """
                ---------
                |       |
                |   ●   |
                |       |
                ---------""";
        String two = """
                ---------
                |●      |
                |       |
                |      ●|
                ---------""";
        String three = """ 
                ---------
                |●      |
                |   ●   |
                |      ●|
                ---------""";
        String four = """
                ---------
                |●     ●|
                |       |
                |●     ●|
                ---------""";
        String five = """
                ---------
                |●     ●|
                |   ●   |
                |●     ●|
                ---------""";
        String six = """
                ---------
                |●  ●  ●|
                |       |
                |●  ●  ●|
                ---------""";
        switch(randomNumber){
            case 1 -> System.out.println(one);
            case 2 -> System.out.println(two);
            case 3 -> System.out.println(three);
            case 4 -> System.out.println(four);
            case 5 -> System.out.println(five);
            case 6 -> System.out.println(six);
        }
    }
}
