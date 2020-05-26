package Aminor_z.Lab1;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("二次方程求解，请输入a b c(空格分隔)：");
        double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
        double t = b * b - 4 * a * c;
        if (t > 0) System.out.printf("有2个实数根：x1=%f, x2=%f\n", (-b + t) / 2.0d / a, (-b - t) / 2.0d / a);
        else if (t == 0) System.out.printf("有1个实数根：x=%f\n", -b / 2 / a);
        else System.out.printf("没有实数根\n");
    }
}
