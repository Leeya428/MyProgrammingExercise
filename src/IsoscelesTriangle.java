import java.util.Scanner;


public class IsoscelesTriangle {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 0;i <= n;i++) {
                for (int j = n; j > i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 0 ;j < 2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }else {
            System.out.print("you system in  wrong");
        }

    }
}
