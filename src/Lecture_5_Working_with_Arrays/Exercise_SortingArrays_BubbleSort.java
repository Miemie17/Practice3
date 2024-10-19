package Lecture_5_Working_with_Arrays;

public class Exercise_SortingArrays_BubbleSort {
    public static void main(String[] args) {
        int [] sorting = {7,234,5,57,213,2,332,546,77,7674};

        //Using bubble sort algorithm
        for(int i=0 ; i<sorting.length-1 ; i++){
            for (int k=0 ; k<sorting.length-1 ; k++){
                if (sorting[k]>sorting[k+1]){
                    //swap k and k+1
                    int temporary = sorting[k];
                    sorting[k] =  sorting[k+1];
                    sorting[k+1] = temporary;
                }
            }
        }

        System.out.print("Sorted = {");
        for (int num : sorting){
            System.out.print(num);
            if (num!=sorting[sorting.length-1]){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
