package com.latihan;

import java.util.Scanner;

public class InputNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        String nama = input.nextLine();
        System.out.println( "Hai " + nama );
    }
}
