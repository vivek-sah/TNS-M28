package Day2;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ");
        int len=sc.nextInt();
        int a[]=new int[len];
        System.out.println("Enter the "+len+" element ");
        for (int i = 0; i <len ; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("Printing the element of array using the foreach loop");
        for (int element: a ) {
            System.out.print(element+" ");
        }
    }
}
