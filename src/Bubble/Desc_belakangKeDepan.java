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
public class Desc_belakangKeDepan {
    public static void main(String[] args) {
        int[] data = {5,23,10,1,4,9,17,31,2,3};
        
        for (int i = data.length-1; i > 0; i--) {
            for (int j = data.length-1; j > 0; j--) {
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
