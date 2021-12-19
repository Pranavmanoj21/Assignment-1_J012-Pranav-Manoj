package com.mpstme;

import java.util.Scanner; //Importing package

public class Main {

    public static void main(String[] args) {
//	Neon Number
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        number = sc.nextInt();
        int sq = number * number;

        while(sq != 0)
        {
            int digit = sq%10;
            sum = sum + digit;
            sq = sq / 10;
        }
        if (number == sum)
            System.out.println(number + " is a Neon Number.");
        else
            System.out.println(number + " is not a Neon Number.");

    }
}
