package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args){
//        //Arrays.asList() is part of Arrays helper class
//        ArrayList<Integer>  numsToSum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
////        numsToSum.add(1);numsToSum.add(10);numsToSum.add(16);numsToSum.add(25);
////        numsToSum.add(2);numsToSum.add(1);numsToSum.add(10);numsToSum.add(111);numsToSum.add(21);numsToSum.add(14);
//        System.out.println(numsToSum);
//        Integer theSum = ArrayListPractice.sumEvenNums(numsToSum);
//        System.out.println(theSum.toString());
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList("eat","them ","with ", "a","mouse", "queen"));
        System.out.println("Enter the word length to for the search");
        ArrayListPractice.printoutFiveLtrWords(wordsToSearch);


    }
    public static Integer getUserInput() {
        Scanner scanner =  new Scanner(System.in);
        Integer usersInt = scanner.nextInt();
        return usersInt;
    }
    public static Integer sumEvenNums(ArrayList<Integer> numsToSum){
        Integer sum = 0;
        for (int i=0; i<numsToSum.size(); i++){
            if(numsToSum.get(i) % 2 ==0){
            //System.out.println(numsToSum.get(i));
            sum = sum + numsToSum.get(i);
            }
        }
        return sum;
    }

    public static void printoutFiveLtrWords( ArrayList<String> words){
        for(int i = 0 ; i < words.size(); i++){
            if (words.get(i).length() == 5){
            System.out.println(words.get(i));
            }
        }

    }
}
