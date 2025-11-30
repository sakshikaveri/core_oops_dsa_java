import java.util.Scanner;

class Swap{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();  //creates an object of value "" with name as reference variable

        greet(name); //copy of reference variable(value is passed)
        System.out.println("Hi "+name);
    }
    
    //naam is also copy of reference varibale name and here it is pointing to "" user entered
    static void greet(String naam) {
        naam = "Lakshmi";  // creates a new object of naam reference variable, old name reference variable value is not changed
    }
}
// NOTE
//Java creates a copy of the variable being passed in the method and then do the manipulations. Hence the change is not reflected in the main method.