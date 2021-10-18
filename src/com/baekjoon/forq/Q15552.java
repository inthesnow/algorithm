package com.baekjoon.forq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(bf.readLine());
        int[] r =new int[T];

        for(int i = 0; i < T; i++) {
            int sum = 0;
            sb.append(bf.readLine());
            StringTokenizer token = new StringTokenizer(sb.toString());
            sum = Integer.parseInt(token.nextToken())+Integer.parseInt(token.nextToken());
            r[i] = sum;
            sb.setLength(0);
        }

        for(int i =0; i< T; i++) {
            bw.write(r[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
