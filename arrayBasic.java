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
     public static void main(String[] args) {
        int num[]={10,2,3,4,5};
        int key=3;
        // displayarray(num);
        int number=linearSearch(num,key);
        System.out.println(number);

     }
}
