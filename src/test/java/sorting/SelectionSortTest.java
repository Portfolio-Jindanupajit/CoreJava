package sorting;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Selection Sort should work")
class SelectionSortTest extends SortTest{

    @Override
    protected Sort getSorter() {
        return new SelectionSort();
    }

}