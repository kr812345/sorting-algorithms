public class Bubble_sort{
    public static void main(String[] args) {
        int[] arr = {1,9,99,0,999,1000,333,777,22,11};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    for(int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    }
}