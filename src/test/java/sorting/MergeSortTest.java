package sorting;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Merge Sort shuld work")
class MergeSortTest extends SortTest {

    @Override
    protected Sort getSorter() {
        return new MergeSort();
    }
}