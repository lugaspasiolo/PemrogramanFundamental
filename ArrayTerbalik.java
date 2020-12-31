package com.latihan;

import java.util.*;

public class ArrayTerbalik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println();

        for(int i= array.length-1;i>=0;i--)
            System.out.println(array[i]);
    }
}
