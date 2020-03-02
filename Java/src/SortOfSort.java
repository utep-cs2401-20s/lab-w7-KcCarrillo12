public class SortOfSort{
    public void sortOfSort(int[] arry) {
        int maxNum = arry[0];

        for (int i = 0; i < arry.length; i++) {
            if (maxNum < arry[i])
                maxNum = arry[i];
        }
        System.out.println(maxNum);
    }
}
