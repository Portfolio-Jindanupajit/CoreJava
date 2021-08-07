package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Quick Sort should work")
class QuickSortTest extends SortTest {

    @Override
    protected Sort getSorter() {
        return new QuickSort();
    }
}