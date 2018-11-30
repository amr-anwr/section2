/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assi;

/**
 *
 * @author One
 */
public class Assi {

    /**
     * @param args the command line arguments
     */
    
    public static void shift(int arr[] , int size){
        int temp=0;
        for(int i = size-1 ; i > 0 ;i--){
            temp = arr[i];
            arr[i]= arr[i-1];
            arr[i-1]= temp;
        }
    }
    public static void main(String[] args) {
      int arr[]= {1,2,3,4,4};
      shift(arr,5);
      for(int i =0 ; i < arr.length;i++) 
       System.out.println(arr[i]);
    }
    
}
