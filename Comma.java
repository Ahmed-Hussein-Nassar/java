
package comma;
import java.util.Scanner;
public class Comma {

    public static void main(String[] args) {
    
       Scanner input=new Scanner(System.in) ;
      String s;
        s = "ahmed,hussein,nassar";
      String ss;
       ss= s.replace(","," ");
        System.out.println(ss);   
    }
    
}
