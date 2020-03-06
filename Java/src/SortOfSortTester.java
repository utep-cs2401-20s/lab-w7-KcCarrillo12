import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SortOfSortTester {

  @Test
    public void sortOfSort1(){ //This test case tests the method sortOfSort (Passed)
        int[] arry = {7, 9, 3, 8, 20, 13, 1, 7};
        int[] testArr = {9, 8, 3, 1, 7, 7, 13, 20};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(arry);
        assertArrayEquals(testArr, arry);
    }

    @Test
    public void sortOfSort2(){ //This test case tests if sortOfSort method can handel odd arrays (Passed)
        int[] arry = {10, 3, 9, 8, 5};
        int[] testArr = {8, 5, 3, 9, 10};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(arry);
        assertArrayEquals(testArr, arry);
    }

    @Test
    public void sortOfSort3(){ //This test case tests if sortOfSort method can handel an
        int[] arry = {10, 5, 5, 10, 2, 2, 9, 9}; //array of multiple duplicate numbers (Passed)
        int[] testArr = {9, 9, 2, 2, 5, 5, 10, 10};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(arry);
        assertArrayEquals(testArr, arry);
    }

    @Test
    public void sortOfSort4(){ //This test case tests if sortOfSort method can handel large arrays (Passed)
        int[] arry = {16, 3, 15, 9, 13, 1, 19, 17, 10, 8};
        int[] testArr = {16, 15, 9, 8, 1, 3, 10, 13, 17, 19};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(arry);
        assertArrayEquals(testArr, arry);
    }

    @Test
    public void sortOfSort5(){ //This test case tests if sortOfSort method can handel short arrays
        int[] arry = {0, -2};  //with negative numbers (Passed)
        int[] testArr ={-2, 0};
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(arry);
        assertArrayEquals(testArr, arry);
    }
}