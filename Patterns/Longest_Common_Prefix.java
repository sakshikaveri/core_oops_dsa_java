package Patterns;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        System.out.println(cmmonPrefix(s));

    }

    static String cmmonPrefix(String[] s) {
        if (s.length == 0) return "";
        String prefix = s[0];

        for (int i = 1; i < s.length; i++) {
            while (!s[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }

        }
        return prefix;

    }
}
