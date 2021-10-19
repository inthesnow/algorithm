package com.baekjoon.forq;

import java.io.*;

public class Q2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            sb.append(" ");
        }
        //sb.setLength(n-1);
        for (int i = 1; i <= n; i++) {
            sb.insert(n-i,"*");
            sb.deleteCharAt(n-i+1);
            bw.write(sb.toString()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
