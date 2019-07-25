/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package standardeviasi1;

import java.util.Scanner;

/**
 *
 * @author Pangling
 */
public class StandarDeviasi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        float[] x;
        float total=0;
        
        Scanner Baca = new Scanner(System.in);
        System.out.println("Total Data = ");
        n=Baca.nextInt();
        x = new float[n];
        for (int i=0; i<n; i++){
            System.out.println("data ke = " +(i+1)+"=");
            x[i] = Baca.nextInt();
            total += x[i];
        }
        float xr = total/n;
        total = 0;
        for (int i=0; i<n; i++)
            total += (x[i]-xr)*(x[i]-xr);
        float sd = (float) Math.sqrt(total)/n;
        
        System.out.println("Standar deviasi = " + sd);
        
        
    }
    
}
