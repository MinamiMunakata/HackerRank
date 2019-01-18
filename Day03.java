import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day03 {
    private static String weirdOrNot(int n) {
        if (n % 2 == 0) {
            if (n > 20)
                return "Not Weird";
            if (n >= 2 && 2 <= 5)
                return "Not Weird";
        }
        return "Weird";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        System.out.println(weirdOrNot(N));
    }
}
