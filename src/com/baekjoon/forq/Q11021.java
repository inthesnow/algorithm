package com.baekjoon.forq;

import java.io.*;
import java.util.StringTokenizer;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(bf.readLine());
        int r[] = new int[T];
        int A[] = new int[T];
        int B[] = new int[T];

        for (int i = 0; i < T; i++) {
            sb.append(bf.readLine());

            StringTokenizer st = new StringTokenizer(sb.toString());

            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());

            r[i] = A[i]+B[i];

            sb.setLength(0);
        }
        for (int i = 0; i < T; i++) {
            bw.write("Case #"+(i+1)+": ");
            bw.write(A[i]+" + "+B[i]+" = "+r[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
