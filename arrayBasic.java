public class arrayBasic {
    public static void displayarray(int num[]){
        for(int i=0;i<=num.length-1;i++)
        {
            System.out.println(num[i]);
        }
    }
     public static void main(String[] args) {
        int num[]={10,2,3,4,5};
        
        displayarray(num);
     }
}
