package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Random random = new Random();
    /*System.out.println("first random int is " + random.nextInt(10));
    System.out.println("First random double is " +random.nextDouble());
    int min = 1;
    int max = 10;
    int newRandom = random.nextInt((max-min)+1) + min;
    System.out.println(newRandom);
   System.out.println(Math.);
   int rand = (int)(Math.random()*10);
   System.out.println(rand);*/
        /*System.out.println("how many numbers do you want");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("what is your minimum number?");
        int min = sc.nextInt();
        System.out.println("what is your maximum number?");
        int max = sc.nextInt();
        for (int i = 0; i<userInput; i++){
            int newRandom = random.nextInt((max-min)+1) + min;
            System.out.println(newRandom);
        }*/
        HashMap<Integer, Integer> diceTally = new HashMap<Integer, Integer>();
        System.out.println("how many sides does your dice have");
        Scanner sc = new Scanner(System.in);
        int diceSides = sc.nextInt();
        Random rand = new Random();
        System.out.println("how many times do you want to throw your dice?");
        int timesThrown = sc.nextInt();
        for (int i = 0; i < timesThrown; i++){
            int diceThrow = rand.nextInt(diceSides)+1;
            int counter = 0;
            
            diceTally.put(diceThrow, counter);
        }
        System.out.println(diceTally);
    }
}
