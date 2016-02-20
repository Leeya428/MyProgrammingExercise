import java.util.Scanner;

/**
 * Created by Leeya on 16/2/19.
 */
public class DiamondWithName {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {

            for (int i = 0;i <= n/2;i++) {
                for (int j = n/2; j > i ; j--) {
                    System.out.print(" ");
                }
                for (int j = 0 ;j < 2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Liya");
            for (int i = n/2; i > 0 ; i--) {
                for (int j = i; j < n/2 ; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2*i-1 ; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }

        }else {
            System.out.print("you system in  wrong");
        }

    }

}
