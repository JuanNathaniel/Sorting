/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author DEA
 */
public class Bubble_Sort {
    static void BubbleSort(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {       
            for (int j = 0; j < arrays.length-i-1; j++) {   
                if(arrays[j] > arrays[j+1]){    
                    //tukar posisi
                    int temp = arrays[j+1];     
                    arrays[j+1] = arrays[j];    
                    arrays[j] = temp;                      
                }
            } 
        }
    }
    public static void main(String[] args) {
        
        int[] arrays = {5,3,6,8,1,9,2,4,10,7};
        
        BubbleSort(arrays);
        
        for (int p = 0; p < arrays.length; p++) {
            System.out.print(arrays[p]+" ");                     
        }
    }
}
