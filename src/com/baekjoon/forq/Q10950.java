package com.baekjoon.forq;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        int sol[] = new int[T];
        String  c = s.nextLine();

        for (int i=0;i<T;i++) {
            c = s.nextLine();
            String[] arr = c.split(" ");
            sol[i] = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        }

        for (int i=0; i<T; i++) {
            System.out.println(sol[i]);
        }
    }
}
