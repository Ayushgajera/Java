public class arrayBasic {
    public static void displayarray(int num[]){
        for(int i=0;i<=num.length-1;i++)
        {
            System.out.println(num[i]);
        }
    }
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++)
        {
            if (num[i]==key) {
                return i;
            }
        }
        System.out.println("no key found");
        return -1;
    }
    public static int binarysearch(int num[],int key){
        int start=0,end=num.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (num[mid]==key) {
                return mid;
            }
            if (num[mid]<key) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key=12;
        // displayarray(num);
       System.out.println("index key is:" +binarysearch(num,key));

     }
}
