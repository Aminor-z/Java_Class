package Aminor_z.lab5;

public class Rect {
    double length,width;
    public Rect(){}
    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area()
    {
        return length*width;
    }
    public double peri()
    {
        return (length+width)*2.0d;
    }

}
