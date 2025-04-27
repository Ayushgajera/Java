import java.util.*;

public class arrayquestion {
    public static void reverseArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;

        }
    }

    public static void pairsInArray(int num[]) {
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
            }
            System.out.println();
        }

    }

    public static void subarray(int num[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {
                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += num[k];
                    System.out.print(num[k] + "");
                }
                System.out.print("  sum of subarray is :" + sum);
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
                System.out.println();
            }
            System.err.println();
        }
        System.out.println("min of subarray:" + min);
        System.out.println("max of subarray:" + max);

    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        // reverseArray(num);
        // for(int i=0;i<num.length;i++)
        // {
        // System.out.print(num[i]+" ");
        // }
        System.out.println();
        subarray(num);
    }
}
