package com.baekjoon.ifq;

import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String arr[] = a.split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1])-45;

        if (h!=0&&m>=0){
            System.out.println(h+" "+(m));
        } else if (h!=0&&m<0) {
            System.out.println((h-1)+" "+(60+m));
        } else if (h==0&&m>=0) {
            System.out.println(0+" "+(m));
        } else {
            System.out.println(23+" "+(m+60));
        }

    }
}
