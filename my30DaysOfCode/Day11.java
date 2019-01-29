import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int max = getSumOfHourGlass(arr, 0, 0);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (getSumOfHourGlass(arr, i, j) > max) {
                    max = getSumOfHourGlass(arr, i, j);
                }
            }
        }

        System.out.println(max);
    }

    private static int getSumOfHourGlass(int[][] arr, int row, int col) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 1 && j == 0) || (i == 1 && j == 2)) {
                    sum += 0;
                } else {
                    sum += arr[row + i][col + j];
                }
            }
        }
        return sum;
    }
}
