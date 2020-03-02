import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {
    //5 test cases
    //put comments for the test cases.

    @Test //defaut test case (i dont even think its written correctly lol)
    public void sortOfSort1() {
        int[] arry = {7, 9, 3, 8, 20, 13, 1, 7};
        int[] testArr = {9, 8, 3, 1, 7, 7, 13, 20};
        SortOfSort sol = new SortOfSort();
        assertArrayEquals(testArr, sol.sortOfSort(arry));
    }
}
