package Aminor_z.lab8;

public class Lab8 {
    public static void main(String[] args) {
        try
        {
            System.out.println(2333/0);
        }
        catch(ArithmeticException e){
            System.out.println("哦哦哦哦哦~ 有一个异常：");
            e.printStackTrace();
            throw e;
        }
        finally {
            System.out.println("qwq");
        }
    }
}
