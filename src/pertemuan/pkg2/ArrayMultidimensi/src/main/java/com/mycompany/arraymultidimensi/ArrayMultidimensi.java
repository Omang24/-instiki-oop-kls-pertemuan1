package com.mycompany.arraymultidimensi;

import java.util.Scanner;

public class ArrayMultidimensi {

    public static void main(String[] args) {
        String[][] meja = new String[3][3];
        Scanner inp = new Scanner(System.in);
        
        for (int brs = 0; brs < 3; brs++) {
            for (int klm = 0; klm < 3; klm++) {
                // Perbaikan format pada printf
                System.out.printf("Data Meja Baris: %d, Kolom: %d: ", brs , klm);
                meja[brs][klm] = inp.nextLine();
            }
        }
    }
}
