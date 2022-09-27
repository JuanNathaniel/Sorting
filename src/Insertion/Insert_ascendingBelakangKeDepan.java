/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insertion;

/**
 *
 * @author Ju
 */
public class Insert_ascendingBelakangKeDepan {
    public static void main(String[] args) {
        
        int[] data = {3,8,5,2,9,6,1,10,7,4};
        
        for (int i = data.length-2; i >= 0; i--) {
            int temp=data[i];
            int j=i+1;
            while((j>=data.length)&&(data[j]<temp)){
                data[j-1] = data[j];
                j++;
            }
            data[j-1]=temp;
            
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
