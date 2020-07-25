package c2;

public class InsertSort {
 
    static void s2(int [] data){
        for (int i =1; i < data.length; i++){
            int key = data[i];
            int j =  i-1;
            while(j >= 0 && key < data[j]){
                data[j+1] = data[j];
                j--;
            }
            data[j +1] = key;
        }
    }
    static void sort(int [] data){

        for(int i = 1; i < data.length; i++){
            int currentIndex = i;
            while(currentIndex > 0 &&  data[currentIndex] < data[currentIndex-1]) {
                int temp = data[currentIndex];
                data[currentIndex] = data[currentIndex -1];
                data[currentIndex -1] = temp;
                currentIndex--;
            }
        }
    }
    public  static void main(String[] args) {
        int [] data =  new int[] {5, 2, 4, 6, 1, 3};

        s2(data);

        for(int i: data){
            System.out.print(i +",");
        }
    }
}