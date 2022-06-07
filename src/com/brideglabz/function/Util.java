package com.brideglabz.function;

 //Function to check the day of week of given date
 //*@param d int value for day of date
 //* @param m int value for month of year
 //* @param y int value for year
// * @return day of week from 1 to 7
 public class Util {


     static int dayOfWeek(int d, int m, int y);

     int y0 = y - (14 - m) / 12;
     int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
     int m0 = m + 12 * ((14 - m) / 12) - 2;
     int d0 = (d + x + (31 * m0) / 12) % 7;

     return d0;

 }


     //Function to convert fahrenhenit to celcius and vice-versa

     // tem the value of temperature
     // t the character ie c or f for given temp to convert
     // return converted temperature

     static int temperatureConversion(int tem, char t) {

         int conver;
         if (t == 'c' || t == 'C'){

         }else if ( t == 'f' || t == 'F') {
             conver = (tem - 32) * 5 / 9;

         }else{
             System.out.println("Enter correct input");
             return 0;

         }
         return conver;



     }

     static double monthlyPayment(double p, double y, double r){
         double n = 12 * y;
         double r0 = r /(12 * 100);
         double payment = p * r0 / (1 - Math.pow((1 + r0), - n));
         return payment;
     }
     //to calculate monthly payment for r interest and p principal for years
     //p for the principal amount given
     //y for the year for which p is given
     // r for rate at which p is givan
     //return monthly payment


     static double sqrt(double c){

         double t = c;
         double epsilon = 1e-15;
         while (Math.abs(t - c / t) > epsilon * t) {
             t = (c / t + t) / 2;
         }

         return t;
     }

     // Function to convert decimal to binary
     // d for integer value to convert
     // return return integer array with binary digits



     static int[] toBinary(int d){
         String bin = " ";
         while ( d != 0){
             bin = 0 + bin;
             d/= 2;
         }
         while (bin.length() % 4 != 0){
             bin = 0 + bin;
         }
         return stringToIntArray(bin);


     }

     //Function to convert string to int array helper function for swapnibble
     //in Binary.java class


     static int[] stringToIntArray(string bin)
         int[] binary = new int[bin.length()];
         for (int i = 0; i < binary.length; i++){
             binary[i] = bin.charAt(i) -48;

     }
         return binary;


         //Function to convert binary to decimal

     static int toDecimal(int[] binary){
         int dec = 0, j = 0;
         for (int i  binary.length - 1; i >= 0; i--){
             if (binary[i] == 1){
                 dec = dec + (int) Math.pow(2, j);

             }
             j++;

         }
         return dec
     }
 }






