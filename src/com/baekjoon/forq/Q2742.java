package com.baekjoon.forq;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(bf.readLine());

        for(int i=N; i>0; i--){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
