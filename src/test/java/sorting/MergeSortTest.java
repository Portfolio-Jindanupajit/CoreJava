package sorting;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Merge Sort should work")
class MergeSortTest extends SortTest {

    @Override
    protected Sort getSorter() {

        return new MergeSort();
    }
}