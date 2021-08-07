package sorting;

public class MergeSort implements Sort {


    @Override
    public int[] sort(int[] data) {

        if (data.length < 1) {
            return data;
        }

        // Split the arrays
        int ptrMiddle = data.length/2;
        int[] dataLeft = new int[ptrMiddle];
        int[] dataRight = new int[data.length-ptrMiddle];

        for (int i = 0; i < data.length; i++) {
            if (i < ptrMiddle) {
                dataLeft[i] = data[i];
            }
            else {
                dataRight[i-ptrMiddle] = data[i];
            }
        }

        // Sort Left & Right
        sort(dataLeft);
        sort(dataRight);

        // Merge the arrays
        int i = 0;
        int ptrLeft = 0;
        int ptrRight = 0;

        while (i < data.length) {
            if (dataLeft[ptrLeft] < dataRight[ptrRight]) {
                data[i++] = dataLeft[ptrLeft++];
            }
            else {
                data[i++] = dataRight[ptrRight++];
            }
        }

        while(ptrLeft < dataLeft.length) {
            data[i++] = dataLeft[ptrLeft++];
        }

        while(ptrRight < dataRight.length) {
            data[i++] = dataRight[ptrRight++];
        }

        return data;
    }
}
