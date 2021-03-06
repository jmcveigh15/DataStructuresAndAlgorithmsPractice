package src.sortAlgorithms;

public class ShellSort {

    // O(n^2) worst case but better than insertion sort

    public static void main(String[] args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElement  = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }

        for (int loop = 0; loop < intArray.length; loop++) {
            System.out.println(intArray[loop]);
        }
    }
}
