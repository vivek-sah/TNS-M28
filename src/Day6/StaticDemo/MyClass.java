package Day6.StaticDemo;

public class MyClass {
    private int section;
    private static int srNo;

    private static String name="vivek";

    static {
        System.out.println("in static block");
        srNo++;
//        section++;//can't initialized non static variable
    }
    MyClass(){
        System.out.println("In the constructor");
        section++;
        srNo++;
    }
    static void show(){
        //System.out.println(section);// can't modify non static variable
        System.out.println(srNo);
    }
    public void display(){
        System.out.println(section);
        System.out.println(srNo);
    }


}
