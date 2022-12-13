
package max;
import java.util.Scanner;
public class Max {

   public static void main(String[] args) {
       
      Scanner input=new Scanner(System.in) ;

    int[] arr = {3,7,35,14,25, 88,10};
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
       
    if(max<arr[i])
      max=arr[i];
    
    }
    System.out.println(max);
    }
 }
 
   
