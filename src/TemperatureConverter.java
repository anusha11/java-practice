import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double temperature;
        String temperatureUnit;
        double convertedTemperature;

        System.out.print("Enter the temperature: ");
        temperature = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        temperatureUnit = scanner.next();

        if(temperatureUnit.equalsIgnoreCase("f") || temperatureUnit.equalsIgnoreCase("c")){
            convertedTemperature = (temperatureUnit.equalsIgnoreCase("f")) ? temperature * (9.0/5.0) + 32 : (temperature - 32) * (5.0/9.0);
            System.out.printf("\nTemperature is %.2f°%s", convertedTemperature, temperatureUnit.toUpperCase());
        }else{
            System.out.println("Invalid Input!!!");
        }

        scanner.close();
    }
}
