package com.latihan;

import java.util.*;

public class HitungAngkaGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka= 0, totalGanjil = 0;
        try {
            while (true){
                angka= input.nextInt();
                if (angka %2 != 0){
                    totalGanjil++;
                }
            }
        }
        catch (NumberFormatException e){
            System.out.println(totalGanjil);
        }
        catch (Exception e){
            System.out.println(totalGanjil);
        }
    }
}
