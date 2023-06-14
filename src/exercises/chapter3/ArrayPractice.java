package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        ArrayPractice arrayPractice = new ArrayPractice();
//        arrayPractice.printNums();
//        arrayPractice.splitStrings();
        arrayPractice.splitStringsSentences();
    }

    public void printNums(){
        //classVariables
        int[] intsArray = {1, 1, 2, 3, 5, 8 };
        /*for (int i: intsArray) {
            if (intsArray[i] % 2 == 1){
            System.out.println(intsArray[i]);}*/
        for (int i =0 ; i<intsArray.length; i++){
            if (intsArray[i] % 2 == 1){
            System.out.println(intsArray[i]);}
        }
    }
    public void splitStrings(){
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //store words in an array
        String[] storeWords = myString.split(" ");
        System.out.println(Arrays.toString(storeWords));
    }
    public void splitStringsSentences(){
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //store words in an array
        String[] storeWords = myString.split("\\.");
        System.out.println(Arrays.toString(storeWords));

    }
}
