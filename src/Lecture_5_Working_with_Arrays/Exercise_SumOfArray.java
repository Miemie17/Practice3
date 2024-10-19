package Lecture_5_Working_with_Arrays;

public class Exercise_SumOfArray {
    public static void main(String[] args) {
        //sum of all array elements
        int [] sumArray = {1,2,3,4,5};
        int sum = 0;
        for (int sumArrayElement: sumArray){
            sum += sumArrayElement;
        }
        System.out.println(sum);

    }
}
