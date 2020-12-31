package com.latihan;

import java.util.*;

public class GarisPersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                if ((i==0) || (i==angka-1) || (j==0) || (j== angka-1)){
                    System.out.print("#");
                }else if (angka%2 == 0){
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
