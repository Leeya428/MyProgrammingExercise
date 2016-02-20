import java.util.Scanner;

public class DrawHorizontalLine {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.print("you system in  wrong");
        }

    }

}
