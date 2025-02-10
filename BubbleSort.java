/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @Name : BubbleSort.java
 * @version : 1.0
 * @author : CY Wong
 * @since : 2022-02-10
 * @description : To implement the algorithm for bubble sort
 */
public class BubbleSort {
    
    // class method for bubble sort
    static void bSort(int[] array) {
        int n = array.length;
        boolean flag = false;
        int i,j = 0;
        for (i=0; i < n-1; i++)
        {
            // compare and swap 
            for (j=0; j<n-i-1; j++){
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
    
    // class method to display list
    static void Printlist(int[] array) {
        for (int i:array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    // main method
    public static void main(String[] args) {
        int[] arr = {164, 23, 35, 12, 22, 11, 90};      // sample list 1
        int[] arr1 = {64, 343, 215, 912, 722, 110, 900}; // sample list 2
        int[] arr2 = {4, 244, 250, 120, 22, 110, 9000};   // sample list 3
        
        System.out.println("Original list:");
        Printlist(arr1);
        
        bSort(arr1);
        
        System.out.println("Sorted list:");
        Printlist(arr1);
    }
}
