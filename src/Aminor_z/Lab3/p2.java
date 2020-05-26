package Aminor_z.Lab3;


import java.util.Scanner;

public class p2 {
    public static class Circle {
        private  double r;

        public Circle() {
        }

        public Circle(double r) {
            this.r=r;
        }

        public void set_r(double r) {
            this.r = r;
        }

        public double get_r() {
            return r;
        }

        public double area() {
            return r * r * Math.PI;
        }

        public double peri() {
            return 2.0d * r * Math.PI;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        Circle cir1 = new Circle();
        cir1.set_r(r);
        System.out.printf("cir1-area:%f,cir1-peri:%f\n", cir1.area(), cir1.peri());
        Circle cir2 = new Circle(r);
        System.out.printf("cir2-area:%f,cir2-peri:%f\n", cir2.area(), cir2.peri());
        s.close();
    }
}
