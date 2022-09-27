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
public class Selection_Sort {

    public static void main(String[] args) {

        int[] arrays = {8, 4, 1, 7, 5, 3, 9, 6, 2, 10};

        for (int i = 0; i < arrays.length - 1; i++) {
            int min = arrays[i];
            for (int j = 1 + i; j < arrays.length; j++) {
                if (arrays[min] > arrays[j]) { 
                    min = j;  
                }
            }
            int temp = arrays[min];   //temp = arrays{1}
            arrays[min] = arrays[i];  // arrays{1} = arrays{0}
            arrays[i] = temp;         // arrays{0} = arrays{1}
        }
        for (int p = 0; p < arrays.length; p++) {
            System.out.print(arrays[p] + " ");
        }
    }
}
