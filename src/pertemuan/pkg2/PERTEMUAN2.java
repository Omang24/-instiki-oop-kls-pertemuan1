package pertemuan.pkg2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author INSTIKI
 */
public class PERTEMUAN2 {

    /**
     * @param args argumen yang diterima dari command line
     */
    public static void main(String[] args) {
        String nama = "jono";  
        long nim = 2301010069L;  
        double ipk = 3.79;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Input Nama Mahasiswa
            System.out.print("Input Nama Mahasiswa: ");
            nama = dtain.readLine();
            
            // Input NIM Mahasiswa
            System.out.print("Input NIM Mahasiswa: ");
            nim = Long.parseLong(dtain.readLine()); // Mengubah input ke tipe data long
            
            // Input IPK Mahasiswa
            System.out.print("Input IPK Mahasiswa: ");
            ipk = Double.parseDouble(dtain.readLine()); // Mengubah input ke tipe data double

        } catch (IOException e) {
            System.out.println("Error dalam pembacaan data!");
        } catch (NumberFormatException e) {
            System.out.println("NIM dan IPK harus berupa angka!");
        }
        
        // Menampilkan data yang telah diinput
        System.out.println("\n===== Data Mahasiswa =====");
        System.out.println("Nama saya: " + nama);
        System.out.println("NIM: " + nim);
        System.out.printf("IPK saya: %.2f\n", ipk);
    }
}
