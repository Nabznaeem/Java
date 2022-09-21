package src.FirstWeek;
/*Given a number N, write a program to print Fibonacci Series up to the N term.
Input: N = 10
Output: 0 1 1 2 3 5 8 13 21 34*/

public class Fibonacci {
    static void Fibn(int N)
    {
        int n1 = 0, n2 = 1;

         for (int i=0;i < N;i++) {

            System.out.print(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {

        int N = 10;
        Fibn(N);
    }
}

