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
public class Insert_ascendingDepanKeBelakang {
    public static void main(String[] args) {
        
        int[] data = {2,42,3,12,6,9,23,1,10,4};
        
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j=i-1;
            while((j>=0)&&(data[j]>temp)){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
        
    }
}
