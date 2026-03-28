package Patterns;

public class First_Unique_Character {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(uniqueCharacter(s));
    }

    static int uniqueCharacter(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;

        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;

        }
        return 0;
    }
}
