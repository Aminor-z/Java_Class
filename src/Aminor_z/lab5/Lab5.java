package Aminor_z.lab5;

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double length,width,height;
        length = s.nextDouble();
        width = s.nextDouble();
        height = s.nextDouble();
        Cub cub1 = new Cub();
        cub1.setLength(length);
        cub1.setWidth(width);
        cub1.setHeight(height);
        System.out.printf("cub1-Area：%f\n",cub1.area());
        System.out.printf("cub1-Peri：%f\n",cub1.peri());
        Cub cub2 = new Cub(length,width,height);
        System.out.printf("cub2-Area：%f\n",cub2.area());
        System.out.printf("cub2-Peri：%f\n",cub2.peri());
        Rect rc1 = new Rect(length,width);
        System.out.printf("rc1-Area：%f\n",rc1.area());
        System.out.printf("rc1-Peri：%f\n",rc1.peri());
    }
}
