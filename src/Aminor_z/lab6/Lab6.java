package Aminor_z.lab6;

import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Shape shp;
        double l,w,h;
        while(true)
        {
            int op = s.nextInt();
            switch(op)
            {
                case 1:
                    l=s.nextDouble();
                    w=s.nextDouble();
                    shp = new Rect(l,w);
                    System.out.printf("Rect area: %f\n",shp.area());
                    System.out.printf("Rect peri: %f\n",shp.peri());
                    break;
                case 2:
                    l=s.nextDouble();
                    w=s.nextDouble();
                    h=s.nextDouble();
                    shp = new Cub(l,w,h);
                    System.out.printf("Cube area: %f\n",shp.area());
                    System.out.printf("Cube peri: %f\n",shp.peri());
                    break;
                default:
                    break;

            }
        }
    }
}
