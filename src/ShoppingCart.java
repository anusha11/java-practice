import java.util.Scanner;
public class ShoppingCart {

    public static void main(String args[]){

        int quantity;
        String item;
        double unitPrice;
        double total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        unitPrice = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        total = unitPrice * quantity;
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is $" + total);
        scanner.close();
    }
}
