// Fibonacci Series With Recursion

import java.util.Scanner;

class FibonacciRecursion{

    public static int fibonacci(int n){

        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }
}
