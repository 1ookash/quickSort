public class QuickSort {
    public static void main(String[] args) {
    }

    private static void quickSort(int[] array, int left, int right) {
        int mid = (left + right) / 2;
        int i = left;
        int j = right;
        int tmp;

        while (i < j) {
            while (array[i] < array[mid]) {
                i ++;
            }
            while (array[j] > array[mid]) {
                j --;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i ++;
                j --;
            }
        }

        if (i < right) {
            quickSort(array, i, right);
        }
        if (j > left) {
            quickSort(array, left, j);
        }
    }
}
