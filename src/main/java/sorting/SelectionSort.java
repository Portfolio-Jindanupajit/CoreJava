package sorting;

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] data) {

        for (int i = 0; i < data.length; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    Sort.swap(data, i, j);
                }
            }
        }

        return data;
    }
}
