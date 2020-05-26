package Aminor_z.Lab2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) throws FileNotFoundException {
        int array[] = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++)
            array[i] = s.nextInt();
        Arrays.sort(array);
        for(int t : array)
        {
            System.out.println(t);
        }
        PrintWriter pw = new PrintWriter("F:\\p3_file.txt");
        for(int t : array)
        {
            pw.println(t);
        }
        pw.flush();
    }
}
