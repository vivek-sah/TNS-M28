package Day6.FinalDemo;

public class FinalVariable {
    final int x=5;

    final static int y;

    final static int z=10;

    //    void change()
//    {
//        x=45;//can't change once variable initialized with final keyword
//        y=23;// can't change once variable initialized with final keyword
//    }
    static
    {
        y=30;// variable can be initialized using static keyword once it is declared
//        z=67;// can't change once variable initialized with final keyword
    }

    public static void main(String[] args) {
        System.out.println(y);
    }
}
