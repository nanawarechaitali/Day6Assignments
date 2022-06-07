package com.brideglabz.function;
import java.util.Scanner;



public class Vendingmachine {

    // Static Variables I   for declared to change notes and static variables  total is
    // declared tocount total notes.
    static int I,TOTAL;


    //Static array to store values of notes
    static int[] NOTES = { 1000,500,100,50,10,5,2,1};



    // Function for Calculating the notes
     static void notes(int value ){
         if (value / NOTES[I] != 0 ){
             TOTAL += (value / NOTES[I]);
             System.out.println(NOTES[I] + "rs notes :" + value / NOTES[I]);
             value = value % NOTES[I];

         }
         I++;
         if (value == 0){
             System.out.println("total notes :" + TOTAL);
             return;
         }
         notes(value);

     }
     // main method to test the class.
    ;

    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("enter amount");
            int value = s.nextInt();
            notes(value);
            s.close();
        }catch (Exception e) {
            System.out.println("enter value in integer");
        }
    }
}
