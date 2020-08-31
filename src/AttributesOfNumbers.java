
import java.util.Scanner;
import java.util.Random;

public class AttributesOfNumbers {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        Random x = new Random();
        int luckyNumber;
        luckyNumber = 1 + x.nextInt(1000);
        System.out.println("Your number:");
        int number = scan.nextInt();
        System.out.printf("Your lucky Number is %d", luckyNumber);
        System.out.println("\n");
        if (number % 10 == 0) {
            System.out.println("Your number is round");
        }
        if (number % 2 == 0) {
            System.out.println("Your number is even");
        }
        if (number == luckyNumber) {
            System.out.println("Your number is a lucky number");
        }
        if (number < 100 && number >= 10) {
            System.out.println("Your number has two digits");
        }

    }
}
