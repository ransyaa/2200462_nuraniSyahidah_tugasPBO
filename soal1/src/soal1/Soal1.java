/*
Nurani Syahidah
2200462
Pendidikan Ilmu Komputer A 2022

SOAL GENAP 1
Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah 
masukan pecahan dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
 */

package soal1;

/**
 *
 * @author User
 */ 
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan pecahan 1 (pembilang/penyebut dengan spasi): ");
        int pb1 = scanner.nextInt();
        int py1 = scanner.nextInt();
        
        System.out.print("Masukkan pecahan 2 (pembilang/penyebut dengan spasi): ");
        int pb2 = scanner.nextInt();
        int py2 = scanner.nextInt();
        
        System.out.print("Masukkan pecahan 3 (pembilang/penyebut dengan spasi): ");
        int pb3 = scanner.nextInt();
        int py3 = scanner.nextInt();
        
        double pecahan1 = (double) pb1/py1;
        double pecahan2 = (double) pb2/py2;
        double pecahan3 = (double) pb3/py3;
        
        System.out.println("Hasil Penjumlahan : " + (pecahan1 + pecahan2 + pecahan3));
        System.out.println("Hasil Pengurangan : " + (pecahan1 - pecahan2 - pecahan3));
        System.out.println("Hasil pengalian : " + (pecahan1 * pecahan2 * pecahan3));
        System.out.println("Hasil Pembagian : " + (pecahan1 / pecahan2 / pecahan3));
    }
    
}
