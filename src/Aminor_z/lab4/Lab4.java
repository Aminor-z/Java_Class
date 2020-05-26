package Aminor_z.lab4;

public class Lab4 {
    public static void main(String[] args) {
        //p1
        Student st1 = new Student("s001","孙悟空",500);
        st1.setTotal(40);
        System.out.printf("%s  %s  %d  %d\n",st1.getSnum(),st1.getSname(),st1.getSage(),st1.getTotal());
        Student st2 = new Student("s002","唐僧",50);
        st2.setTotal(35);
        System.out.printf("%s  %s  %d  %d\n",st2.getSnum(),st2.getSname(),st2.getSage(),st2.getTotal());
        System.out.println(Student.getTotal());
        //p2
        int newAge=20;
        st1.changeValue(newAge);
        System.out.println(newAge);//传值
        st1.changeValue(st2);
        System.out.println(st2.getSage());//传地址
        //p3
        Student st3=new Student();
        System.out.printf("%s  %s  %d  %d\n",st3.getSnum(),st3.getSname(),st3.getSage(),st3.getTotal());
        //因为没有额外赋值
    }

    public static class Student {

        private String snum,sname;
        private int sage;
        private static int total=0;
        public Student(){
            total++;
        }
        public Student(String snum,String sname,int sage){
            this.snum = snum;
            this.sname = sname;
            this.sage = sage;
        }

        public static void setTotal(int total) {
            Student.total = total;
        }

        public void setSnum(String snum) {
            this.snum = snum;
        }

        public void setSname(String sname) {
            this.sname = sname;
        }

        public void setSage(int sage) {
            this.sage = sage;
        }

        public int getSage() {
            return sage;
        }

        public static int getTotal() {
            return total;
        }

        public String getSname() {
            return sname;
        }

        public String getSnum() {
            return snum;
        }
        //p2
        public void changeValue(int age) {age = 111;}
        public void changeValue(Student s){s. sage=222;}
        //p3
        {
            snum="s000";
            sname="我是谁";
            sage=22;
            total=40;

        }
    }
}
