package com.daydash;

import java.util.*;
import java.io.*;
import java.lang.*;

public class java_loops {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            series(a, b, n);
            System.out.println();
        }
        in.close();
    }

    static void series(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += power(2, i) * b;
            System.out.print(sum + " ");
        }
    }

    static int power(int n, int pow) {
        int ans = 1;
        for (int i = 0; i < pow; i++) {
            ans *= n;
        }
        return ans;
    }
}
