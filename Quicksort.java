
package quicksort;


public class Quicksort {

    public static void main(String[] args) {
      
      int arr[] = {10, 88,7, 2,33,13, 9, 1, 6};
        int n = arr.length;
 
          Sortdata b = new  Sortdata();
          b.Sortdata(arr, 0, n-1);
 
        System.out.println("sorted array :");
        b.printArray(arr);
    }
    
}
