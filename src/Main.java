

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        int test = 0;
        helper(3, test);
    }

    private static void helper(int n, int test) {
        if (n == 0) return;

        test = n + 1;

        System.out.println(test);

        helper(n - 1, test);
    }






}