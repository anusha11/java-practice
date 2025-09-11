import java.util.Random;
public class GenerateRandomNumbers {

    public static void main(String[] args){

        double randomValue;
        boolean isHeads;
        Random random = new Random();
        randomValue = random.nextDouble(1, 10000);
        System.out.println(randomValue);
        isHeads = random.nextBoolean();
        if(isHeads) {
            System.out.println("HEADS!");
        }
            else{
            System.out.println("TAILS!");
        }

    }
}
