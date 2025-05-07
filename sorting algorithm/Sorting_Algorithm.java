// Concept: 
//large element come to the end of array by swapping with adjacent element

public class Sorting_Algorithm {
    public static void bubbleSort(int nums[]) {
        boolean swap = false;
        for (int turn = 0; turn < nums.length - 1; turn++) {
            for (int j = 0; j < nums.length - 1 - turn; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    swap = true;
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;

                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void selectionSort(int nums[]) {

        for (int i = 0; i < nums.length - 1; i++) {
            int minimum = i;
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[minimum] > nums[j]) {
                    minimum = j;
                }

            }
            // swap
            int temp = nums[i];
            nums[i] = nums[minimum];
            nums[minimum] = temp;

        }
    }
    public static void insertionSort(int nums[])
    {
        for(int i=1;i<nums.length;i++)
        {
            int current=nums[i]; //store temparary variable
            int prev=i-1;
            while (prev>=0 && nums[prev]> current) {
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=current;
        }
    }
    public static void printArray(int nums[])
    {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
    
    
    public static void main(String[] args) {
        int nums[]={5,4,1,2,3};
        // int nums[] = { 1, 2, 3, 4, 5 };
        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);
         

        
        printArray(nums);
    }
}
