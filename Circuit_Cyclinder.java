
package task1;
import java.util.Scanner;
public class Circuit_Cyclinder {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        double y,h;
        circle c1=new circle();
        
        cylinder cy=new cylinder();
        
        
        System.out.println("         welcome");
       
               while(true){
                   
       System.out.println("enter siutable");   
               System.out.println("1-get the area of circule");  
               System.out.println("2-get the area of cylinder");  
               System.out.println("3-exit"); 
               x=input.nextInt();
               switch (x){
        case 1:
        System.out.print(" enter radious of circle ");
        y=input.nextDouble();
        c1.setRadius(y);
         System.out.print("the area of the circule is "+c1.getarea());
         break;
        case 2:
            System.out.print(" enter the radious of cylinder ");
        y=input.nextDouble();
        
        c1.setRadius(y);
         System.out.print(" enter the hight of cylinder ");
        h=input.nextDouble();
        cy.setHeight(h);
        
         System.out.print("the area of the cylinder is "+cy.getvolum());
         break;
        case 3:
            return;
            
         
        
        
    }
   
               }  
    }
    
}
