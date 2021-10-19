package com.baekjoon.forq;

import java.io.*;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        sb.append(br.readLine());
        StringTokenizer st1 = new StringTokenizer(sb.toString());
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());
        sb.setLength(0);

        sb.append(br.readLine());
        StringTokenizer st2 = new StringTokenizer(sb.toString());
        for(int i=0;i<N;i++){
            int a = Integer.parseInt(st2.nextToken());
            if(a<X) bw.write(a+" ");
        }
        bw.flush();
        bw.close();
    }
}
