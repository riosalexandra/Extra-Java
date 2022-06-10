import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = 2;
        int secondNumber = 5;

        var subtraction = 7;
        int answer;
        String prompt =". Press ENTER when ready.";
        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply your result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of " + prompt);
        scanner.nextLine();
        System.out.println("Now subtract " + subtraction + prompt);
        scanner.nextLine();


        scanner.close();
    }
}


