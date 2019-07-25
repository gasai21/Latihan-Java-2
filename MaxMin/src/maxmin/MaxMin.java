/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
 *
 * @author Pangling
 */
public class MaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int range;
 int[] nilai = {20, 11, 53, 21, 35, 4, 82, 9, 22};
 int max = 0;
 int min = 1000;
 for (int a = 0; a < nilai.length; a++) {
      if (nilai[a] > max) {
          max = nilai[a];
      } else if (nilai[a] < min) {
          min = nilai[a];
      }
 }
 System.out.println("Nilai Maksimum : " + max);
 System.out.println("Nilai Minimun  : " + min);
 
  // Mencari Range
        range = max - min;
        System.out.println("Range " +range+"");
        System.out.println("");
       
 }
}
