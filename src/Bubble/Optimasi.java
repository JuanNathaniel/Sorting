/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble;

/**
 *
 * @author TUF GAMING
 */
public class Optimasi {

    public static void main(String[] args) {
//        for (int i = 0; i < arrays.length; i++) {       
//            for (int j = 0; j < arrays.length-i-1; j++) {   
//                if(arrays[j] > arrays[j+1]){    
//                    //tukar posisi
//                    int temp = arrays[j+1];     
//                    arrays[j+1] = arrays[j];    
//                    arrays[j] = temp;                      
//                }
//            } 
//        }
        int[] arrays = {5, 3, 6, 8, 1, 9, 2, 4, 10, 7};
        
        int i = 0;
        int j = 0;
        boolean bol = false;
        while (i < arrays.length && bol == false) {
            while (j < arrays.length - i - 1) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                } else {
                    bol = true;
                    break;
                }                
            }
            if (bol == true) {
                break;
            }            
        }
        
        for (int k = 0; k < arrays.length; k++) {
            System.out.print(arrays[k]+"   ");
        }
    }
}
