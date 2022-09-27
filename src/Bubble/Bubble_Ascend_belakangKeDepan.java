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
public class Bubble_Ascend_belakangKeDepan {
    public static void main(String[] args) {
        int[] data = {12,42,1,23,5,2,10,31,9,15};
        
        for (int i = data.length; i > 0; i--) {
            for (int j = data.length-i; j > 0; j--) {
                if (data[j-1] > data[j]) {
                    int temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"   ");
        }
    }
}
