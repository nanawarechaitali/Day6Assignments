package com.brideglabz.function;
import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int num, i, count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = s.nextInt();


        for(i=2; i<=num/2; i++){
            if(num%i == 0){
                count++;
                break;
            }
        }
        if (count==0)
            System.out.println("\nIt is a prime number");
        else
            System.out.println("\nIt is not prime number");
    }
}
