package com.latihan;

import java.util.Scanner;

public class KurangBagusSangatBagus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int nilai = input.nextInt();

        if (nilai < 55) {
            System.out.println("Kurang");
        } else if (nilai <= 75) {
            System.out.println("Bagus");
        } else  {
            System.out.println("Sangat Bagus");

        }
    }
}
