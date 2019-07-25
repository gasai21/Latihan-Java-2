/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rata.rata;

import java.util.Scanner;

/**
 *
 * @author Pangling
 */
public class RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int n, nilai[];
        float rata, jumlah = 0;
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();
 
        //Inisialisasi array
        nilai = new int[n];
 
        //Input nilai
        for(int i=0;i<= n-1;i++){
            System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
 
        //Hitung Jumlah
        for(int j=0;j<= n-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata = jumlah/n;
 
        //Output
        System.out.println("Daftar Nilai :");
        System.out.println("----------------");
        System.out.println("Nilai rata-rata : " + rata);
    
        
    }
    
}
