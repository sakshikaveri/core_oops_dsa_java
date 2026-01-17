import java.util.Random;

public class Stringbuffer {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        sb.append("SakshiKaveri");
        System.out.println(sb.capacity());

        // constructor 2
        StringBuffer sb1 = new StringBuffer(30);
        System.out.println(sb1.capacity());

        // constructor 3
        StringBuffer sb2 = new StringBuffer("HelloWorld");
        System.out.println(sb2.capacity());

        // METHODS
        // sb.insert(6," is ");
        // sb.replace(1,6,"eema");
        // sb.reverse();
        // sb.delete(1,6);

        String str = sb.toString();
        System.out.println(str);

        // Generating random string
        int n = 25;
        String result = generateString(n);
        System.out.println(result);
    }

    static String generateString(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // System.out.println(random.nextFloat()*26);
            int randomChar = 97 + (int) (random.nextFloat() * 26);
            sb.append((char) randomChar);
        }
        return sb.toString();
    }
}
