/*
Nurani Syahidah
2200462
Pendidikan Ilmu Komputer A 2022

SOAL GENAP 3
Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII 
dari karakter ‘A’ dan karakter ‘B’!
 */
package soal3;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan karakter 1 : ");
        char a = scanner.next().charAt(0);
        
        System.out.print("Masukkan karakter 2 : ");
        char b = scanner.next().charAt(0);
        
        int ASCIIa = (int) a;
        int ASCIIb = (int) b;
        
        int hasil = a + b;
        
        System.out.println("Hasil penjumlahan kode ASCII dari " + a + " dan " + b + " adalah : " + hasil);
        
        scanner.close();
    }
    
}
