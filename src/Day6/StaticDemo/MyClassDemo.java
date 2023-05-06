package Day6.StaticDemo;

public class MyClassDemo {
    public static void main(String[] args) {
        MyClass my =new MyClass();
        my.show();
        my.display();

        // static method can be call without create of object of class
        MyClass.show();
    }
}
