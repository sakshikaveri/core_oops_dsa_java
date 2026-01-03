
import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        boolean result = checkPrime(num);
        System.out.println(num + " is a prime number- " + result);
    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        int firstNum = 2;
        while (firstNum * firstNum <= num) {
            if (num % firstNum == 0) {
                return false;
            }
            firstNum++;

        }

        return true;
    }
}
// "To check if a number N is prime, I test if it's divisible by any number from 2 up to √N."
// Why √N only?
// Factors always come in pairs. If N = A × B, then one of them is always ≤ √N.