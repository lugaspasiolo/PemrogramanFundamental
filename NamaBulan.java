package com.latihan;

import java.util.*;

public class NamaBulan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] bulan = {
                "Nomor tidak valid",
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
                "Nomor tidak valid",
        };

        int nomorBulan = input.nextInt();

        System.out.println( bulan[nomorBulan] );
    }
}
