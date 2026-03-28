package Patterns;

import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) {

        String s = "IV";
        System.out.println(romanToInteger(s));

    }

    static int romanToInteger(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }
}
