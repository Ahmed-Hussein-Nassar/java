
package task2;

public class MyOnlineShop {

    public static void main(String[] args) {
       Product [] p = new Product[3];
        p[0]=new Book ();
        Product b1=new Book ();
         b1.setPrice ( 100 );
        b1.display ();
         Product b2=new ChildrenBook  ();
          b2.setPrice ( 100 );
          b2.display ();
    }

    }
    

