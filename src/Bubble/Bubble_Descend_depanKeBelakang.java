/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bubble;

/**
 *
 * @author Ju
 */
public class Bubble_Descend_depanKeBelakang {
    public static void main(String[] args) {
        int[] data = {10,23,51,2,27,11,9,43,1,10};
        
        for (int i = data.length; i > 0; i--) {
            for (int j = data.length-i; j > 0; j--) {
                if (data[j] > data[j-1]) {
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"   ");
        }
    }
}
