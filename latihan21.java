/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 62818
 */
import java.util.Scanner;
public class latihan21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int banyakMahasiswa = input.nextInt();
        
        int[] nilaiMahasiswa = new int[banyakMahasiswa];
        int totalNilai = 0;
        
        // Loop to input students' scores
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }
        
        // Calculate average
        double rataRata = (double) totalNilai / banyakMahasiswa;
        
        // Display the average score
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        
        // Developer name
        System.out.println("Developed by : Rizki Adam Kurniawan");
    }

}
