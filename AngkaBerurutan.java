package com.latihan;

import java.util.*;

public class AngkaBerurutan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        int[] a = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            a[i]= input.nextInt();
        }
        ujian(a);
    }
    public static int ujian(int[] a) {

        int count =1, max =1;
        for (int j = 1; j < a.length; j++) {
            if (count >= max) {
                max = count;
            }
            if (a[j] > a[j - 1]) {
                count++;
            } else {
                count = 1;
            }
        }
        System.out.println(max);
        return max;
    }
}
