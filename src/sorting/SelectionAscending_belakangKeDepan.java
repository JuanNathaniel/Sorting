/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author TUF GAMING
 */
public class SelectionAscending_belakangKeDepan {
    public static void main(String[] args) {
        
        int[] arrays = {6,2,4,11,38,43,5,7,2,20};
        
        for (int i = 0; i < arrays.length; i++) {
            int min = i;            
            for (int j = i+1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min]) { 
                    min = j; 
                }
            }
            int temp = arrays[min];
           arrays[min] = arrays[i];
            arrays[i] = temp;
        }
        for (int i = arrays.length-1; i >= 0; i--) {
             System.out.print(arrays[i]+"  ");
        }

       
    }
}
