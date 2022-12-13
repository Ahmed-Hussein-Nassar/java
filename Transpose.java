
package transpose;
import java.util.Scanner;

public class Transpose {
public static void main(String[] args) {
        
      Scanner input=new Scanner(System.in) ;
    System.out.println("the Enter numbers ");
     int arr[][]={  {5,8,9}
                   ,{4,7, 1},
                    {6,3,9}};
    int[][] new_arr =new int[3][3];
   
 for(int i =0;i<3;i++){
     
    for(int j =0;j<3;j++){
       
    
    new_arr[j][i]=arr[i][j];
    }
 }
  for(int i =0;i<3;i++){
     
    for(int j =0;j<3;j++){
  System.out.print(new_arr[i][j]+" ");
 
    }
     System.out.println(" ");
  }
}  
}
    
    
   
