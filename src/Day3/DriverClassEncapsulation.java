package Day3;

public class DriverClassEncapsulation {
    public static void main(String[] args) {
        BaseClassEncapsulation obj=new BaseClassEncapsulation();
        obj.setName("Vivek");
        obj.setSerialNo(15);
        obj.setAge(22);
        System.out.println(obj);
    }
}
