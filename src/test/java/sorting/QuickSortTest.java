package sorting;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Quick Sort should work")
class QuickSortTest extends SortTest {

    @Override
    protected Sort getSorter() {
        return new QuickSort();
    }
}