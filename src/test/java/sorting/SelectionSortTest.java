package sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("SelectionSort should work")
class SelectionSortTest {

    private static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1}),
                Arguments.of(new int[]{6, 7, 8, 9, 10}, new int[]{10, 8, 9, 7, 6}),
                Arguments.of(new int[]{1}, new int[]{1})
        );
    }


    @ParameterizedTest
    @MethodSource("data")
    @DisplayName("Sort should work")
    public void sort(int[] expected, int[] data) {

        Sort sort = new SelectionSort();
        int[] actual = sort.sort(data);

        assertArrayEquals(expected, actual ,"Sorter must return sorted array.");
    }
}