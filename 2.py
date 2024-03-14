def selection_sort(arr):
    size = len(arr)
    for i in range(size - 1):
        min_index = i
        for j in range(i + 1, size):
            if arr[j] < arr[min_index]:
                min_index = j
        arr[i], arr[min_index] = arr[min_index], arr[i]
    print(*arr)

a = [3, 4, 2, 23, 12, 5, 32, 22]
selection_sort(a)
