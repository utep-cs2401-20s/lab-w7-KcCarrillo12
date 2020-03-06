public class SortOfSort{
    public static void sortOfSort(int[] arry ){
        int maxNum = 0;
        int arryEnd = arry.length - 1;
        int arryBeg = 0;
        int counter = 0;
        int numCurr = 0;

        while(arryBeg < arryEnd){
            numCurr = arryBeg;

            for(int i=arryBeg; i<=arryEnd; i++){
                if(arry[i] > numCurr){
                    numCurr = arry[i];
                    maxNum = i;
                }
            }

            if(counter == 0){
                swapArry(arry, maxNum, arryEnd);
                counter++;
                arryEnd--;
            }
            else if(counter == 1){
                swapArry(arry, maxNum, arryEnd);
                counter++;
                arryEnd--;
            }
            else if(counter == 2){
                swapArry(arry, maxNum, arryBeg);
                counter++;
                arryBeg++;
            }
            else{
                swapArry(arry, maxNum, arryBeg);
                counter++;
                arryBeg++;
            }
            if(counter == 4){
                counter = 0;
            }
        }
    }

    public static void swapArry(int[] arry, int maxNum, int swap){ //helper method
        int tempNum;
        tempNum = arry[maxNum];
        arry[maxNum] = arry[swap];
        arry[swap] = tempNum;
    }
}
