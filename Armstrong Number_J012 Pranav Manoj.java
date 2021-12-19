package com.mpstme;

import java.util.Scanner; //Importing package

public class Main {

    public static void main(String[] args) {
        // Armstrong Number
        int number, temp, total = 0;

        Scanner hm = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =hm.nextInt();

        number = n;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number /= 10;
        }

        if(total == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}
