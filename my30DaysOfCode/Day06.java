import java.io.*;
import java.util.*;

public class Solution {

    public static void evenAndOddIndexedOrderPrint(String[] inputs) {
        for (int i = 0; i < inputs.length; i++) {
            int evenOrOddFlag = 0;
            while (evenOrOddFlag < 2) {
                for (int j = 0; j < inputs[i].length(); j++) {
                    if (j % 2 == evenOrOddFlag) {
                        System.out.print(inputs[i].charAt(j));
                    }
                }
                System.out.print(" ");
                evenOrOddFlag += 1;
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);
        int t = Integer.valueOf(scanner.nextLine());
        String[] inputs = new String[t];
        int i = 0;
        while (scanner.hasNext() && i <= t) {
            String s = scanner.nextLine();
            inputs[i] = s;
            i++;
        }

        scanner.close();

        evenAndOddIndexedOrderPrint(inputs);

    }
}
