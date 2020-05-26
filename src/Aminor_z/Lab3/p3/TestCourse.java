package Aminor_z.Lab3.p3;

import java.util.Scanner;

public class TestCourse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入：课程编号 课程名称 学分");
        Course c = new Course(s.next(),s.next(),s.nextDouble());
        System.out.printf("该课程信息为：\n编号：\t%s\n名称：\t%s\n学分：\t%f\n课时：\t%f\n",c.get_id(),c.get_name(),c.get_mark(),c.get_ClassHour());
    }
}