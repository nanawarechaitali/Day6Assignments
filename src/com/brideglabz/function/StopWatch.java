package com.brideglabz.function;
import java.util.Scanner;
public class StopWatch {

    public long startTimer=0;
    public long stopTimer=0;
    public long elapsed;

    //to start timer

    public  void start(){
        startTimer=System.currentTimeMillis();
        System.out.println("Start Time is: " +stopTimer);

    }
    //to stop timer

    public void stop(){
        elapsed=stopTimer-startTimer;
        return elapsed;
    }

    public static void main(String[] args) throws Exception{

        StopWatch sw= new StopWatch();
        Scanner s = new Scanner();
        System.out.println("Press '1' to Start Time");
        s.nextInt();
        sw.start();


        System.out.println();
        System.out.println("Press '2' to Stop Time");

        s.nextInt();
        sw.stop();





        long l= sw.getElapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is: " +1);
        System.out.println();
        System.out.println("Covering millisec to seconds: "+(1/1000)+" sec");

    }
}
