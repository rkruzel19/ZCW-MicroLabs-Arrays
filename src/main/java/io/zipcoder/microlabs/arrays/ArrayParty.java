package io.zipcoder.microlabs.arrays;


import java.util.Arrays;

public class ArrayParty {

    public String printArray(String[] inputArray){
        String output = "*** Output ***\n";
        for (String element : inputArray){
            output += element + "\n";
        }
        output = output.trim();
        return output;
    }

    public String lastElement(String[] inputArray){
        String output = "*** Output ***\n";
        output += inputArray[inputArray.length - 1];
        return output;
    }

    //TODO Define the method lastButOne
    public String lastButOne(String[] inputArray){
        String output = "*** Output ***\n";
        output += inputArray[inputArray.length - 2];
        return output;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray){
        String output = "*** Output ***\n";
        for(int i = inputArray.length - 1; i >= 0; i--){
            output += inputArray[i] + "\n";
        }
        output = output.trim();
        return output;
    }

    //TODO Define the method isPalindrome
    public boolean isPalindrome(String[] inputArray){
        String[] reversedArray = new String[inputArray.length];
        int reversedArrayIndex = 0;
        for (int index = inputArray.length - 1; index >= 0 ; index--){
            reversedArray[reversedArrayIndex] = inputArray[index];
            reversedArrayIndex++;
        }

        if (Arrays.equals(inputArray, reversedArray)){
            return true;
        } else {
            return false;
        }
    }

    //TODO Define the method compress
    public String compress(int[] inputArray){
        String output = "*** Output ***\n" + inputArray[0] + "\n";
        int previousElement = inputArray[0];
        for (int index = 1; index < inputArray.length; index++){
            if (inputArray[index] != previousElement){
                output += inputArray[index] + "\n";
            }
            previousElement = inputArray[index];
        }

        output = output.trim();
        return output;
    }

    //TODO Define the method pack
    public String pack(char[] inputArray){
        String output = "*** Output ***\n";
        char previousChar = inputArray[0];

        for (char element : inputArray){
            if (element == previousChar){
                output += element;
            } else {
                output += ", " + element;
                previousChar = element;
            }
        }
        return output;
    }



}
