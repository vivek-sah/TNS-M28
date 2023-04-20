package Day2;


public class Operator {
    public static void main(String[] args) {

        System.out.println(".........Unary Operator............ ");
        int a=20;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a++ + ++a);
        System.out.println(~a);
        boolean b=true;
        System.out.println(!b);

        System.out.println("..........Arithmetic Operator...........");
        int num1=10;
        int num2=5;
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

        System.out.println("...........Assignment Operator...........");
        int num3=20;
        num3+=5;
        System.out.println(num3);
        num3*=2;
        System.out.println(num3);
        num3/=10;
        System.out.println(num3);

        System.out.println("...........Logical Operator.............");
        int num4=10;
        int num5=20;
        int num6=5;
        System.out.println(num6<num4 || num6<num5);
        System.out.println(num4<num5 && num4>num6);

        System.out.println("............Ternary Operator............");
        int num7=(num5>num6)?num5:num6;
        System.out.println(num7);
    }
}