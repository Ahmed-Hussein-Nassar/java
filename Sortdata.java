
package quicksort;

public class Sortdata {
   int p(int arr[], int min, int max)
    {
        int x = arr[max];
        int i = (min-1);
        for (int j=min; j<max; j++)
        {
            if (arr[j] <= x)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[max];
        arr[max] = temp;
 
        return i+1;
    }
 
    void Sortdata(int arr[], int min, int max)
    {
        if (min < max)
        {
            
            int y = p(arr,min, max);
 
         
            Sortdata(arr, min, y-1);
            Sortdata(arr, y+1, max);
        }
    }
 
  
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
  
}
    
