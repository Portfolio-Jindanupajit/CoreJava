package sorting;


import org.junit.jupiter.api.DisplayName;

@DisplayName("Bubble Sort should work")
class BubbleSortTest extends SortTest {

    @Override
    protected Sort getSorter() {
        return new BubbleSort();
    }
}