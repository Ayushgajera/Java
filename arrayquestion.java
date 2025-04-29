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
    public static void prefixSubarraySum(int num[]) {
        int max = Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for (int i = 1; i < prefix.length; i++) {
           prefix[i]=prefix[i-1]+num[i];
        }
        
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {
                int sum = i==0?prefix[j]:prefix[j]-prefix[i-1];

                
                System.out.print("  sum of subarray is :" + sum);
                if (sum > max) {
                    max = sum;
                }
                System.out.println();
            }
            System.err.println();
        }
        System.out.println("max of subarray:" + max);

    }
    public static void kadansAlgo(int num[]) {
        int max = Integer.MIN_VALUE;
        int cs=0;
        for (int i = 0; i < num.length; i++) {
                cs=cs+num[i];
                if (cs<0) {
                   cs=0;
                }
                max=Math.max(cs,max);
                
        }
        System.out.println("max of subarray:" + max);

    }
    public static void kadansAlgo2(int num[]) {
        //new way to code
        int max = num[0]; 
        int cs = num[0];
    
        for (int i = 1; i < num.length; i++) {
            cs = Math.max(num[i], cs + num[i]);
            max = Math.max(max, cs);
        }
    
        System.out.println("Max of subarray: " + max);
    }

    

    public static void main(String args[]) {
        int num[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // reverseArray(num);
        // for(int i=0;i<num.length;i++)
        // {
        // System.out.print(num[i]+" ");
        // }
        // System.out.println();
        // subarray(num);
        // prefixSubarraySum(num);
        kadansAlgo(num);
        kadansAlgo2(num);
    }
}
