
package task1;

public class cylinder  extends circle {
    
    


    private double height;

    public cylinder() {
    }

    public cylinder(double h) {
        height = h;

    }

    public cylinder(double h, double r) {
        super(r);
        height = h;
    }

    public cylinder(double h, double r, String c) {
        super(r, c);
        height = h;

    }

    @Override
    public String toString() {
        return "cylinder{" + "height=" + height + '}';
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getvolum() {

        return 3.14 * Radius * Radius * height;

}
}
