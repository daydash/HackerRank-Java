package com.daydash;

import java.util.*;
import java.io.*;

public class java_datatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
                if (x >= -32_768 && x <= 32_767) System.out.println("* short");
                if (x >= -2_147_483_648 && x <= 2_147_483_647) System.out.println("* int");
                if (x >= -9_223_372_036_854_775_808l && x <= 9_223_372_036_854_775_807l) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
