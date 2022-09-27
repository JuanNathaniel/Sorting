/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble_Optimaasi;

/**
 *
 * @author TUF GAMING
 */
public class ascendingDepanKeBelakang {
    public static void main(String[] args) {
        int[] arrays = {5,3,6,8,1,9,2,4,10,7};
        
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+"  ");
        }
        System.out.println("");
        
        int i =0;
        int tukar = 0;
        do {
            tukar = 0;
            for (int j = 0; j < arrays.length-1; j++) {
                if (arrays[j] > arrays[j+1]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;
                    tukar++;
                }
            }
            i++;
        } while (i!=arrays.length && tukar!=0);
        System.out.println("i = "+(i-1));
        
        
        for (int k = 0; k < arrays.length; k++) {
            System.out.print(arrays[k]+"  ");
        }
    }
}
