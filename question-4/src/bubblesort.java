import java.util.Arrays;

class bubblesort{
    static void bubbleSort(char array[]) {
        int size = array.length;

    // loop to access each array element
    for (int i = 0; i < (size-1); i++) {

        // check if swapping occurs
        boolean swapped = false;

        // loop to compare adjacent elements
        for (int j = 0; j < (size-i-1); j++) {

            // compare two array elements
            // change > to < to sort in descending order
            if (array[j] > array[j + 1]) {

                // swapping occurs if elements
                // are not in the intended order
               char temp = array[j];
                array[j] = array[j + 1];
                char c = array[j + 1] = temp;

                swapped = true;
            }
        }
        // no swapping means the array is already sorted
        // so no need for further comparison
        if (!swapped)
            break;

    }
}

    public static void main(String args[]) {

        char [] data = { 'a','u','f' };


        bubblesort.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }



}

