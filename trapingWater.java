import java.util.*;
public class trapingWater {
    public static int trappedRainWater(int height[])
    {
        //find leftmax array
        int leftmax[]= new int[height.length];
        int rightmax[]= new int[height.length];
        leftmax[0]=height[0];
        rightmax[height.length-1]=height[height.length-1];
        int n=height.length-1;

        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]) ;//current value , previous value compare
        }
         //find rightmax array
         // count and compare max right (end thi compare karvanu)
        for(int i=n-1;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]); //current value , previous value compare
        }
        int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            //min of (max right and left )
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            //count block of trapped water with formula
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args)
    {
        int height[] = { 4,2,0,6,3,2,5 };
        System.out.println(trappedRainWater(height));
    }
}
