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
public class Tracing_data_contoh {
    public static void main(String[] args) {
        
        int[]data={5,7,2,8,4,5,1,7,8,2};
        
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            int j = i-1;
            while((j>=0)&&(data[j] > temp)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=temp;
            
        }
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
    }
}
