/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion_2;

/**
 *
 * @author TUF GAMING
 */
public class Ascending_BelakangKeDepan {
    public static void main(String[] args) {
        
        int[] data = {2,4,6,20,1,5,9,4,8,2};
        
        for (int i = data.length-2; i >= 0; i--) {
            int temp = data[i];
            int j = i+1;
            while((j<= data.length-1)&&(data[j]<temp)){
                data[j-1]=data[j];
                j++;
            }
            data[j-1]=temp;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
