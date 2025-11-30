import java.util.Arrays;
import java.util.Scanner;

class Swap{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();  //creates an object of value "" with name as reference variable

        greet(name); //copy of reference variable(value is passed)
        System.out.println("Hi "+name);


        // arrays
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void change(int[] array) {
        array[0]=34;  // here the original object is changed
    }

    //naam is also copy of reference varibale name and here it is pointing to "" user entered
    static void greet(String naam) {
        naam = "Lakshmi";  // creates a new object of naam reference variable, old name reference variable value is not changed
    }
}
// NOTE--1
//Java creates a copy of the variable being passed in the method and then do the manipulations. Hence the change is not reflected in the main method.

// NOTE--2
/* When objects are passed to methods here array whenever we modify the array parameter in method it modifies the original array also as it is paased as a reference but it's still call by value */

// For primitve data types--int,char,long,double,float and for String datatype it's call by value and original variable is not changed but for Objects or classes the modfications are reflected in original objects too.