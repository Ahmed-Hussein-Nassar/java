
package circiut.and.tringle;
public class circuit {
     float radius;
public circuit(float r)
{
    radius=r;
    
}
public float area(){
   
  
    return (float) (3.14*(radius*radius));
    
}
public float circumferene()
{
  
    return (float) (3.14*(2*radius));
}

    
public void display()
{
    System.out.println("area circuit= "+area());
     System.out.println(" circumferenecircuit= "+circumferene());
}
}
