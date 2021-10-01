package com.java.pattern;
import java.util.Scanner;

public class Pattern1 {

    public static void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the value of N: ");
        int n = scan.nextInt();
        printPattern(n);
    }
}
