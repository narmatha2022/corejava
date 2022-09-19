package src.FibanocciSeries;

/* Given a number N, write a program to print Fibonacci Series up to the N term.

         Input: N = 10
         Output: 0 1 1 2 3 5 8 13 21 34
 */

public class FibanocciSeries {
    public static void main(String[] args) {
        int N=10,firstTerm=0,secondTerm=1;
        System.out.println("FibonacciSeries upto N term " + N );
        for(int i=0 ;i<N ;i++)
        {

            int  nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
            System.out.println(firstTerm);


        }

    }
}