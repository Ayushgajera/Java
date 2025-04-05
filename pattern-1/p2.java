public class p2 {
    public static void hollow_ragtangle(int tot_rows,int tot_cols)
    {
        for(int i=1;i<=tot_rows;i++)
        {
            for(int j=1;j<=tot_cols;j++)
            {
                if (i==1 || i==tot_rows|| j==1 || j==tot_cols) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
    public static void inverted_half_pyramid(int num)
    {
        for(int i=1;i<=num;i++)
        {
         
            for(int j=1;j<=num-i+1;j++)
            {
                System.out.print(j);
                
            }
            System.out.println();
            
        }
    }
    public static void Floyds_Triangle(int num)
    {
        int count=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
                
            }
            System.out.println();
            
        }
    }
    public static void odd_even_triangle(int num)
    {
        for(int i=1;i<=num;i++)
        {
        
            for(int j=1;j<=i;j++)
            {
                if ((i+j)%2==0) {
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            
                
            }
            System.out.println();
            
        }
    }
    public static void  butterfly(int num)
    {
        for(int i=1;i<=num;i++)
        {
         
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            for(int sp=1;sp<=2*(num-i);sp++)
            {
                System.out.print("  ");
                
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
           

            System.out.println();
            
        }
        //  inverted
        for(int i=1;i<=num;i++)
        {
         
            
            for(int j=num;j>=i;j--)
            {
                System.out.print("* ");
                
            }
            for(int sp=0;sp<=i*2-3;sp++)
            {
                System.out.print("  ");
                
            }
            for(int j=num;j>=i;j--)
            {
                System.out.print("* ");
                
            }

            System.out.println();
            
        }

    }
    public static void  solid_rhombus(int num){
        for(int i=1;i<=num;i++)
        {
            for(int sp=1;sp<=num-i;sp++)
            {
                System.out.print("  ");
                
            }
            for(int j=1;j<=num;j++)
            {
                System.out.print("* ");
                
            }

            System.out.println();
            
        }
    }
    public static void hollow_rhombus(int num,int tot_rows)
    {
        for(int i=1;i<=num;i++)
        {
         
            
            for(int sp=1;sp<=num-i;sp++)
            {
                System.out.print("  ");
                
            }
            for(int j=1;j<=num;j++)
            {
                if (i==1 || i==tot_rows|| j==1 || j==num) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
           

            System.out.println();
            
        }
    }
    public static void diamond_pattern(int num)
    {
        for(int i=0;i<=num;i++)
        {
            for(int sp=0;sp<=num-i; sp++ )
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //inverted
        for(int i=num;i>=1;i--)
        {
            for(int sp=0;sp<=num-i; sp++ )
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // hollow_ragtangle(4,6);
        // inverted_half_pyramid(5);
        // Floyds_Triangle(5);
        // odd_even_triangle(4);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5,5);
        diamond_pattern(4);
    }
}


// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 

//-----solve palidrone--------
//     1
//    212
//   32123
//  4321234
// 543212345
