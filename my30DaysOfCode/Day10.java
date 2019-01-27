import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day10 {

    private static Integer consecutiveOne(ArrayList<Integer> binaryNum) {
        ArrayList<Integer> counts = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < binaryNum.size(); i++) {
            if (binaryNum.get(i) == 1) {
                count++;
                if (i == binaryNum.size() - 1) {
                    counts.add(count);
                }
            } else {
                counts.add(count);
                count = 0;
            }
        }
        return Collections.max(counts);
    }

    private static ArrayList<Integer> binaryNumber(Integer n) {
        ArrayList<Integer> binary = new ArrayList<>();

        while (n >= 2) {
            binary.add(n % 2);
            n = n / 2;
        }
        binary.add(n);
        Collections.reverse(binary);
        return binary;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(consecutiveOne(binaryNumber(n)));
    }
}
