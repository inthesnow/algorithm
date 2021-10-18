package com.baekjoon.ifq;

import java.util.Scanner;

public class q14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>0) {
            if (b>0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (b>0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }

        if(a>0 && b>0) {
            System.out.println("1");
        } else if (a<0 && b>0) {
            System.out.println("2");
        } else if (a<0 && b<0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

        if(a>0 && b>0) System.out.println("1");
        if(a<0 && b>0) System.out.println("2");
        if(a<0 && b<0) System.out.println("3");
        if(a>0 && b<0) System.out.println("4");

    }
}
