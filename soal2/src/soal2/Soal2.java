/*
Nurani Syahidah
2200462
Pendidikan Ilmu Komputer A 2022

SOAL GENAP 2
Buatlah algoritma dalam Bahasa Java Anda akan diberi hadiah jika rangking 1 dikelas 
dan naik kelas, yang dapat ditulis sebagai ekspresi: (rangking == 1) && (naikKelas)
 */
package soal2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Ranking : ");
        int ranking = scanner.nextInt();
        
        System.out.print("Apakah Anda naik kelas? (true/false): ");
        boolean naikkelas = scanner.nextBoolean();
        
        boolean hadiah = (ranking == 1) && (naikkelas);
        
        if(hadiah){
            System.out.println("Selamat! Anda mendapatkan hadiah!");
    }else{
            System.out.println("Maaf, Anda tidak mendapatkan hadiah");

        }
        
        scanner.close();
    }
    
}
