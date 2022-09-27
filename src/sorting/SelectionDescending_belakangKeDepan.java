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
public class SelectionDescending_belakangKeDepan {
    public static void main(String[] args) {
        int[]arrays= {19,4,1,11,6,2,15,20,3,13};
         
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
        for (int i = arrays.length-1; i >= 0; i--) {
            System.out.print(arrays[i]+"   ");
        }
    }
}
