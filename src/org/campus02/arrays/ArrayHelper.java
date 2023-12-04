package org.campus02.arrays;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int arr[] = new int[100];

        for (int i = arr.length - 1; i > 0; i--){
            arr[100 - i - 1] = i;
        }

        print(arr);
        arrangeOrder2(arr);
        print(arr);

        String[] stringArray = {"Eins", "Zwei", "Drei", "Vier", "Fünf"};
        System.out.println(Arrays.toString(stringArray));
        stringArray = reverseArray(stringArray);
        System.out.println(Arrays.toString(stringArray));
        //System.out.println(stringArray);


        int[] reverse = reverseArray(new int[] {9, 8 , 1 , 2,6, 5 });
        System.out.println(Arrays.toString(reverse));

        System.out.println("isSortedArray(reverse) = " + isSortedArray(reverse));


        arrangeOrder2(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

    public static void print(int[] a) {
        for (int element : a) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    // Laufzeit = O-Notation
    // n*m = 100.000 * 100.000 = 10.000.000.000
    public static void arrangeOrder(int[] numbers) {

        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                // hier
                if (numbers[i] > numbers[i + 1]) {
                    int hilfvariable = numbers[i]; // cola wird in leeren becher geleert
                    numbers[i] = numbers[i + 1]; // fanta wird in cola becher geleert
                    numbers[i + 1] = hilfvariable;
                    //print(numbers);
                    hasChanged = true;
                }
            }
           // System.out.println();
        }
    }

    public static void arrangeOrder2(int[] numbers) {

        boolean hasChanged = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int hilfvariable = numbers[i]; // cola wird in leeren becher geleert
                numbers[i] = numbers[i + 1]; // fanta wird in cola becher geleert
                numbers[i + 1] = hilfvariable;
                hasChanged = true;
            }
        }
        if (hasChanged == true) {
            // ja, es gab noch eine veränderung, einfach nochmals
            arrangeOrder2(numbers);
        }
        else {
            // nein, fertig
        }
    }

    public static void arrangeOrder2(String[] numbers) {

        boolean hasChanged = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i].compareTo(numbers[i + 1]) < 0 ) {
                String hilfvariable = numbers[i]; // cola wird in leeren becher geleert
                numbers[i] = numbers[i + 1]; // fanta wird in cola becher geleert
                numbers[i + 1] = hilfvariable;
                hasChanged = true;
            }
        }
        if (hasChanged == true) {
            // ja, es gab noch eine veränderung, einfach nochmals
            arrangeOrder2(numbers);
        }
        else {
            // nein, fertig
        }
    }

    public static String[] reverseArray(String[] arrayToReverse) {
        String[] result = new String[arrayToReverse.length];

        for(int i = 0; i < result.length;i++) {
            int newIndex = result.length - i - 1;
            result[newIndex] = arrayToReverse[i];
        }

        return result;
    }

    public static int[] reverseArray(int[] arrayToReverse) {
        int[] result = new int[arrayToReverse.length];

        for(int i = 0; i < result.length;i++) {
            int newIndex = result.length - i - 1;
            result[newIndex] = arrayToReverse[i];
        }

        return result;
    }
    
    public static boolean isSortedArray(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
