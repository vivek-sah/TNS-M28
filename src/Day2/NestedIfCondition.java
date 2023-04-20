package Day2;

public class NestedIfCondition {
    public static void main(String[] args) {
        int a=20;
        int b=50;
        int c=40;
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else {
                System.out.println("c is greater");
            }
        }
        else {
            if(c>b){
                System.out.println("c is greater");
            }
            else {
                System.out.println("b is greater");
            }
        }

    }
}
