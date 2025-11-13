
public class EmployeeDetails {
// you cannot declare a static variable inside a method.
// Inside methods (like main()), you can only have local variables, not class-level ones.

    static int totalEmployees = 3;
    final String companyName = "Adobe"; // cannot be modifiFed 

    public static void main(String[] args) {

        //Variables - String
        String name1 = "Siena";
        String name2 = "Anthony";
        String name3 = "Kate";

        //age - int
        int age1 = 20;
        int age2 = 30;
        int age3 = 25;

        //double -- salary
        double salary1 = 15000;
        double salary2 = 50000;
        double salary3 = 30000;

        String[] employeeList = {name1,name2,name3};
        int[] age = {age1,age2,age3};

        for (int i=0;i<employeeList.length;i++) {
            System.out.println(employeeList[i]+" | Age:"+age[i]);
        }

        System.out.println("totalEmployees "+totalEmployees);
        

    }
}
