import java.util.Scanner;


public class DrawVerticalLine {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("*");
            }
        }else {
            System.out.println("you system in  wrong");
        }

    }
}
