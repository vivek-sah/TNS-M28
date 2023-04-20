package Day1;

public class TypesCasting {
    public static void main(String[] args) {
        // widening type casting or implicit type casting
        byte b=12;
        short s=b;
        System.out.println(s);

        float f=45.13f;
        double d=f;
        System.out.println(d);

        int a=45;
        long l=a;
        System.out.println(a);

        char ch='V';
        int c=ch;
        System.out.println(c);


        // narrowing or explicit type casting
        long ld=1525452125l;
        int num=(int)ld;
        System.out.println(num);

        double db=154251234.5d;
        float ft=(float) db;
        System.out.println(db);


    }
}
