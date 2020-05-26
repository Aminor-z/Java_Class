package Aminor_z.lab7;

import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ShapeCalc rc=new Rect(s.nextDouble(),s.nextDouble());
        System.out.printf("Rect area: %f\n",rc.area());
        System.out.printf("Rect peri: %f\n",rc.peri());
        Rect newrc = ((Rect)rc).clone();
        System.out.printf("Rect area: %f\n",newrc.area());
        System.out.printf("Rect peri: %f\n",newrc.peri());
    }
}
