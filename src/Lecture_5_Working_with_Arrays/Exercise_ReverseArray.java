package Lecture_5_Working_with_Arrays;

public class Exercise_ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {1,3,5,7,9,11,13,15,17,19};
        int [] reversedNumbers = new int[numbers.length]; //set reverse as same size of array

        //UNCOMMENT LOGS TO UNDERSTAND

        for (int i=0; i<numbers.length;i++){
            reversedNumbers[i] = numbers[numbers.length-1-i]; //=numbers[10-1-i]
//            System.out.println("reversedNumbers[i]=numbers["+numbers.length+"-1-"+i+"]");
//            System.out.println("reversedNumbers[i]=numbers["+(numbers.length-1-i)+"]");
//            System.out.println("New reversedNumber[i] = "+reversedNumbers[i]+"\n");
        }

        System.out.println("Reversed Array: ");
        for (int num : reversedNumbers){
            System.out.print(num);
            if (num != reversedNumbers[reversedNumbers.length-1]){
                System.out.print(", ");
            }

        }
    }
}
