package Aminor_z.Lab2;

public class p2 {
    public static void main(String[] args) {
        String strIm = "I am a student. I like Java Language!  ";
        System.out.println(strIm.length());
        System.out.println(strIm.charAt(0));
        System.out.println(strIm.charAt(strIm.length() - 1));
        System.out.println(strIm.indexOf("student"));
        strIm.trim();
        System.out.println(strIm.substring(2, 5));
        String[] s = strIm.split(" ");
        for (String t : s)
            System.out.println(t);
        StringBuilder sb = new StringBuilder();
        for (String t : s) sb.append(t);
        System.out.println(sb);
        System.out.println(strIm.toUpperCase());
    }

}
