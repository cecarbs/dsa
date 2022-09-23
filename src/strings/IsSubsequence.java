package strings;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 */

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));

    }

    private static boolean isSubsequence(String s, String t) {
        // set two pointers one on string s and the other on string t, we move the pointer on s if it matches t
        // if we get through pointer t first without going through s then it is not a subsequence

        int s_pointer = 0;
        int t_pointer = 0;
        // wouldn't use s.length() - 1 or t.length() - 1 for the same reason you'd run a "while" loop on a single string/array (i.e. you'd never hit the last char)
        // you use && operator instead of || b/c if one is false then it will exit the loop
        // if s isn't a subsequence then it will attempt to keep going since it's true
        while (s_pointer < s.length() || t_pointer < t.length()) {
            if (t.charAt(t_pointer) == s.charAt(s_pointer)) {
                s_pointer++;
            }

            t_pointer++;
        }
        // wouldn't be s.length() - 1 b/c if it's a single char "a" & "b", s_pointer would be at index 0 and the index of s.length() - 1 would be zero so that would return true
        if (s_pointer == s.length()) return true;

        return false;

    }
}
