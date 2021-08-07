package sorting;

import java.util.Arrays;

public class QuickSort implements Sort {

    private void quickSort(int[] data, int begin, int end) {

        if (begin < end) {

            int pivot = data[end];
            int i;
            int j;
            for (i = begin, j = end; i < j; i++, j--) {
                if (data[i] > pivot) {
                    Sort.swap(data, i, j);
                }

            }
            quickSort(data, begin, j);
            quickSort(data, i, end);
        }

    }


    @Override
    public int[] sort(int[] data) {
        quickSort(data, 0, data.length-1);
        return data;
    }
}
