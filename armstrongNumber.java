
import java.util.Scanner;

public class armstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int inputNum = input.nextInt();
        boolean result = checkArmstrong(inputNum);
        System.out.println("Is " + inputNum + " an armstrong number " + result);

    }

    static boolean checkArmstrong(int inputNum) {
        int originalNum = inputNum;
        int digits = String.valueOf(inputNum).length();
        System.out.println("No of digits in " + inputNum + " are " + digits);
        int sum = 0;
        while (inputNum > 0) {
            int remainder = inputNum % 10;
            sum += Math.pow(remainder, digits);
            inputNum = inputNum / 10;

        }

        return sum == originalNum;
    }

}

// number that equals the sum of its own digits, each raised to the power of the total number of digits in the number, such as 153 (\(1^{3}+5^{3}+3^{3}=153\)) or 1634 (\(1^{4}+6^{4}+3^{4}+4^{4}=1634\))
