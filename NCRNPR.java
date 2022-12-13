
package ncr.npr;

 import java.util.Scanner;
public class NCRNPR {

  public static void main(String[] args) {
  
       Scanner input = new Scanner(System.in);
       int n, r,x,y;
        System.out.print("Enter numberof n : ");
        n = input.nextInt();
        System.out.print("Enter number of r : ");
        r = input.nextInt();
         x=fact(n)/(fact(n-r)*fact(r));
         y=fact(n)/(fact(n-r));
        System.out.println("ncr  " +x);
        System.out.println("npr  " +y);
    
    }

    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }

}
          
    

    
    

