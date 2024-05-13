public class mergesort {
    private static void mergeSort(int[] inputarray) {
        int inputlength = inputarray.length;
        if (inputlength < 2) {
            return;
        }
        int midindex = inputlength / 2;
        int[] lefthalf = new int[midindex];
        int[] righthalf = new int[inputlength - midindex];

        for (int i = 0; i < midindex; i++) {
            lefthalf[i] = inputarray[i];
        }
        for (int i = midindex; i < inputlength; i++) {
            righthalf[i - midindex] = inputarray[i];

        }
        mergeSort(lefthalf);
        mergeSort(righthalf);
        merge(inputarray, lefthalf, righthalf);

    }

    private static void merge(int[] inputarray, int[] leftH, int[] rightH) {
        int leftsize = leftH.length;
        int rightsize = rightH.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftsize && j < rightsize) {
            if (leftH[i] <= rightH[j]) {
                inputarray[k] = leftH[i];
                i++;

            } else {
                inputarray[k] = rightH[j];
                j++;
            }k++;


        }while(i < leftsize){
            inputarray[k]=leftH[i];
            i++;
            k++;
        }while (j < rightsize){
            inputarray[k]=rightH[j];
            j++;
            k++;
        }

    }


    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 8, 5};
        mergesort ms = new mergesort();
        ms.mergeSort(arr);
        for (int g : arr) {
            System.out.print(g + " ");
        }
    }
}


