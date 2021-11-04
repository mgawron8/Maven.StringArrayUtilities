package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(value)){
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reverse = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length-(1+i)];
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean equal = true;
        String[] reverse = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length-(1+i)];
            if(!(reverse[i].equals(array[i]))){
                equal = false;
            }
        }
        return equal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //compare letter to letter?
        //if i find a letter, increase a value?
        //if value is = tp 26 i have all the letters
        //need to make array into a string first

        String combined = "";
        int count = 0;
        boolean result = true;

        for (int i = 0; i < array.length; i++) {
            combined = combined + array[i];
        }
        for (int j = 0; j <= 25; j++) {
            for (int i = 0; i < combined.length(); i++) {
                if(combined.charAt(i) == ('a'+j)){
                    count++;
                }
            }
        }
        if (count >= 26){
            result = true;
        }else{
            result = false; //count is not equaling 26
        }


        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String combined = Arrays.toString(array);
        String[] occurance = combined.split(value);
        int result = occurance.length - 1;

        return result;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String holder = "";
        String[] removed;
        for (int i = 0; i < array.length; i++) {
            if (!valueToRemove.equals(array[i])) {
                holder = holder + array[i] + " ";
            }
        }
        removed = holder.split(" ");

        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String holder = array[0] + " ";
        String[] removed;

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])) {
               holder = holder + array[i] + " ";
            }
        }
        removed = holder.split(" ");
        return removed;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String holder = array[0];
        String[] removed;

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i-1])) {
                holder = holder + array[i];
            }else {
                holder = holder + " " + array[i];
            }
        }
        removed = holder.split(" ");
        return removed;
    }


}
