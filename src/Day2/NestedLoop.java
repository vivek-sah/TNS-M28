package Day2;
public class NestedLoop {
    public static void main(String[] args) {
        // printing the table from 1 to 10;
        int beg = 2;
        int end = 10;

        for (int i = beg; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j+" ");
            }

            System.out.println();
        }
    }
}
