package Lecture_5_Working_with_Arrays;

public class Exercise_LargestElement {
    public static void main(String[] args) {
        int []elements = {45,63,74,68,1,5,26};
        int max = elements[0]; //select 0/1st element first as sum
        //System.out.println(elements.length);

        for (int i=1 ; i<elements.length ; i++){    //elements[1] to elements[6]
            //System.out.println("Max: "+max);
            //System.out.println("Current Element to compare to max: "+elements[i]+"\n");
            if (elements[i]>max){
                max = elements[i];
            }
            //System.out.println("Max after comparison: "+max+"\n");

        }
        System.out.println(max);

    }
}
