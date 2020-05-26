package Aminor_z.Lab1;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        s.close();
    }
}
