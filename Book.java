
package task2;

public class Book extends Product{
    String kind;

    @Override
    public int getPrice () {
        return (price- 20);
    }
    
}
