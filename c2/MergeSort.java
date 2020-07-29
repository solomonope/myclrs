package c2;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int data []){
       mergeSort(data, 0, data.length); 
    }

    public static void mergeSort(int data [], int p, int r){

        if(p < r){
         
        int q = (p +r ) /2;
        mergeSort(data, p, q);
        mergeSort(data, q+1, r);
        merge(data, p, q, r);
        }

    }

    public static void merge(int data[], int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for( int i = 0; i < n1; i++ ) {
            L[i] = data[ p + i -1];
        }

        for ( int i = 0; i < n2; i++ ) {
            R[i] = data[ q + i ];
        }

        L[L.length - 1] = Integer.MAX_VALUE;
        R[R.length - 1] = Integer.MAX_VALUE;
        int Li = 0;
        int Ri = 0;

        for ( int i = p; i < r ; i++)  {
            if ( L[Li] <= R[Ri] ){ 
                data[i] = L[Li];
                Li++;
            }else {
              data[i] = R[Ri];
              Ri++;  
            }
        }

    }
    public static void main(String ... args){
    int [] data =  new int[] {5, 2, 4, 6, 1, 3};

        sort(data);

        for(int i: data){
            System.out.print(i +",");
        }
    }
};