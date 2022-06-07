package com.brideglabz.function;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter any integer:");
        n = s.nextInt();
        for (int i = 1; i < n; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("Given number is Perfect");
        }
        else{
            System.out.println("Given number is not Perfect");
        }



    }
    int divisor (int x){
        return x;
    }
}
