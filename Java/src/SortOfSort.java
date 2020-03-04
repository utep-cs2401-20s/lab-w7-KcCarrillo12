public class SortOfSort{
    public static void main(String[] args) {
        int[] arry = {7, 9, 3, 8, 20, 13, 1, 7};

        sortOfSort(arry);
    }

    public static void sortOfSort(int [] arry){
        int x=0;
        int maxNum = arry[0];
        int tempNum;
        while(x < arry.length){
            for (int i = 0; i < arry.length; i++) {
                if(arry[i] > maxNum){
                    maxNum = arry[i];
                    tempNum = arry[arry.length-1];
                    arry[arry.length-1] = maxNum;
                    arry[i] = tempNum;
                }
            }
            System.out.println(maxNum);
            x++;
        }

        for(int i=0; i<arry.length; i++)
            System.out.print(arry[i] + " ");
    }

}
