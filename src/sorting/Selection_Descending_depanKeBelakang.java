/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Ju
 */
public class Selection_Descending_depanKeBelakang {
    public static void main(String[] args) {
        
        int[] arrays = {9, 10, 21,1, 50, 9, 20, 13, 15, 3};
        
        for (int i = 0; i < arrays.length-1; i++) {
            int max = i;           
            for (int j = i+1; j < arrays.length; j++) {
                if (arrays[j] > arrays[max]) { 
                    max = j; 
                }
            }
            int temp = arrays[max];
            arrays[max] = arrays[i];
            arrays[i] = temp;          
        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + "  ");
        }
    }
}
