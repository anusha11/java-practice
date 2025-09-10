import java.util.Scanner;
public class MadLibsGame {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       String adjective1;
       String noun;
       String adjective2;
       String verb;
       String adjective3;

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (Person/Animal): ");
        noun = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb (action ending with -ing): ");
        verb = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nI went to a " + adjective1 + " mountain.");
        System.out.println("There was a " + noun + " with her cub. ");
        System.out.println("She was " + verb + " and " + adjective2 + " with them.");
        System.out.println("The scene was " + adjective3 + "!");

        scanner.close();
    }
}
