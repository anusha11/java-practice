import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args){

        String findFruit;
        String[] fruits = {"Apple", "Mango", "Banana"};
        boolean itemFound = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a fruit to search for: ");
        findFruit = scanner.nextLine();

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equalsIgnoreCase(findFruit)){
                System.out.println("Element found at index " +i);
                itemFound = true;
                break;
            }
        }

        if (!itemFound){
            System.out.println("Element not found");
        }
        scanner.close();
    }
}
