package Aminor_z.Lab3;

import java.time.LocalDate;
import java.util.Date;

public class p1 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getMonthValue()+"/" +ld.getYear());
    }
}
