package com.mpstme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);
        System.out.println("Enter a 10 digit number: ");
        {
            long n = pm.nextLong();
            if (Long.toString(n).length() == 10) {
                int i = 10;
                int sum = 0;
                while (n > 0) {
                    long rem = n % 10;
                    n /= 10;
                    sum += (i * rem);
                    i--;
                }
                if (sum % 11 == 0)
                    System.out.println("It is an ISBN Number!");
                else
                    System.out.println("It is not an ISBN Number...Try Again");
            }
        }
    }
}

