public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println("Value of a "+a);

        {
            //int a = 45;  // cannot be initilised again as it's initialised outside the block
            a=67;  // initialised outside can be modified in the block inside

            int c = 67;
            // c scope remians only till the block

        }
        int c = 78;  // block variable can be intialised again
        System.out.println("Value of a "+a);
        // System.out.println("Value of c "+c); // gives error as intiliased inside block cannot be accessed outside
    }
}
