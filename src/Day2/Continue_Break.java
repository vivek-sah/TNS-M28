package Day2;

public class Continue_Break {
    public static void main(String[] args) {
        // getting the odd number from 1 to 10
        for(int i=1;i<=10;i++){
            if(i%2==0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();





        for(int j=1;j<=10;j++){
            if(j%5==0)
                break;
            System.out.print(j+" ");
        }
        }

}
