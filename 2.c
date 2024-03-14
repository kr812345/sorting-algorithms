#include <stdio.h>

void Selection_sort(int* arr, int size) {
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
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main() {
    int a[] = {3, 4, 2, 23, 12, 5, 32, 22};
    int size = sizeof(a) / sizeof(a[0]);
    Selection_sort(a, size);
    
    return 0;
}
