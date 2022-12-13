
package circiut.and.tringle;

public class tringle {
    int x,y,z;
    public tringle(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
   
    public int area(){
      
        return (x*z)/2;
    }
     public int circumferene(){
      
        return (x+y+z);
    }
     public void display()
{
    System.out.println("area tangle = "+area());
     System.out.println("primater tangle = "+circumferene());
}
    
}
