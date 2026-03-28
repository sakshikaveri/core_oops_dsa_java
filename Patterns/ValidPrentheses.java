package Patterns;

import java.util.Stack;

public class ValidPrentheses {

    public static void main(String[] args) {
        String s = "([)]";
        String s1 = "()[]{}";

        System.out.println(isValid(s1));

    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                System.out.println(stack);
                char top = stack.pop();
                System.out.println(top);

                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
