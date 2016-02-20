/**
 * Created by Leeya on 16/2/20.
 */
public class PrimeFactorsExercise {
    public static void main(String[] arg0){
        final int  N = 30;
        generate(N);
    }
    public static void generate(int n){
        for (int i = 2 ; i <= n ; i++){
            if (n%i == 0){
                System.out.print(i+ " ");
                n=n/i;
            }

        }
    }
}
