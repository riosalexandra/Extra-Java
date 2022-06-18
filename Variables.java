import java.util.Random;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();


        int firstNumber = randomGenerator.nextInt(8) +2;
        int secondNumber = randomGenerator.nextInt(8) +2;

        var subtraction = randomGenerator.nextInt(8) +2;
        int answer = firstNumber * secondNumber - subtraction;

        String prompt =". Don't type in the answer, just press ENTER when you're ready to continue.";
        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply your result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of " + prompt);
        scanner.nextLine();
        System.out.println("Now subtract 7" + prompt);
        scanner.nextLine();
        System.out.println("That's the end of our game now...");
        scanner.nextLine();

        System.out.println("Tha answer is " + answer);

        scanner.close();
    }
}


