package com.mycompany.array1demensi;

import java.util.Scanner;

public class Array1Demensi {

    public static void main(String[] args) {
        String[] nama = new String[5];
        
        Scanner inp = new Scanner(System.in);
        
        for (int idx = 0; idx < 5; idx++) {
            System.out.print("Data Teman Ke-" + (idx + 1) + ": ");
            nama[idx] = inp.nextLine();
        }

        String NamaTeman = nama[3];
        System.out.printf("\nTeman di indeks ke-3: %s\n", NamaTeman);
        
        for (int idx = 0; idx < 5; idx++) {
            System.out.print("Data Teman Ke-" + (idx + 1) + ": "+ nama[idx]);
        }
    }
}
