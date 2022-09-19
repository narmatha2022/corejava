package src.FizzBuzz;


/* FizzBuzz program

         Print numbers from 1 to 100.
         If the number is divisible by 3 , print Fizz instead of the number.
         If the number is divisible by 5 , print Buzz instead of the number.
         If the number is divisible by both 3 and 5 , print FizzBuzz instead of the number.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        int N = 100;
        for (int i = 0; i <= N; i++) {
            if (i % 3 == 0) {
                System.out.println("If the number is divisible by 3 , print Fizz instead of the number " + i);
            }
        }
        N = 100;
        for (int i = 0; i <= N; i++) {
            if( i % 5 == 0){
                System.out.println(" If the number is divisible by 5 , print Buzz instead of the number "+i);
            }

        }
        N=100;
        for(int i=0;i<=N;i++){
            if(i% 3 == 0 & i % 5==0){
                System.out.println(" If the number is divisible by both 3 and 5 , print FizzBuzz instead of the number "+i );
            }
        }

    }
}