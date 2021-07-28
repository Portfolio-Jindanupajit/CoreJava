package sorting;

public interface Sort {

    int[] sort(int[] data);

    static void swap(int[] data, int i, int j) {
        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
}
