package Aminor_z.lab5;

public class Cub extends Rect
{
    double height;

    public Cub() {
    }

    public Cub(double height) {
        this.height = height;
    }

    public Cub(double length, double width, double height) {
        super(length, width);//好方便，这个，直接调用父类构造函数
        this.height = height;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return super.area()*2.0d+width*height*2.0d+length*height*2.0d;
    }

    @Override
    public double peri() {
        return super.peri()*2.0d+height*4.0d;
    }

    public double vol()
    {
        return super.area()*height;
    }
}
