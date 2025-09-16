import java.util.Scanner;
public class WeightConversion {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int option;
        double weight;
        double convertedWeight;
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if (option == 1){

            System.out.print("\nEnter the weight in lbs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight / 2.20462;
            System.out.printf("Weight in Kgs: %.2f", convertedWeight);

        } else if (option == 2){

            System.out.print("\nEnter the weight in kgs: ");
            weight = scanner.nextDouble();
            convertedWeight = weight * 2.20462;
            System.out.printf("Weight in Kgs: %.2f", convertedWeight);
        } else {

            System.out.println("Enter a valid Input!!!");
        }
        scanner.close();
    }
}
