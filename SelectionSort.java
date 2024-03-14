public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 2, 23, 12, 5, 32, 22};
        selectionSort(a);
    }
}
