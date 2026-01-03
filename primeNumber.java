
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
        //o(n)- to iterate till number less than the input number
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        //return true;

        //to iterate till n/2 wherein number greater than half of the number cannot divide the number, for eg if number is 10, divisor greater than 5 i.e 6 cannot divide the number 10.
        // - o(n)
        for (int div = 2; div < div / 2; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        // return true;

        //Squareroot method- o(sqrt n) 
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
