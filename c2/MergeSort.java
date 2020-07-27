package c2;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int data []){
        if(data.length <= 1){
            return;
        }
    
        int left [] = Arrays.copyOfRange(data, 0, data.length / 2);
        int right [] = Arrays.copyOfRange(data,(data.length / 2) + 1, data.length-1);

        
    }
    public static void main(String ... args){

    }
};