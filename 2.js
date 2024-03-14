function selectionSort(arr) {
    const size = arr.length;
    for (let i = 0; i < size - 1; i++) {
        let minIndex = i;
        for (let j = i + 1; j < size; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        [arr[i], arr[minIndex]] = [arr[minIndex], arr[i]];
    }
    console.log(arr.join(' '));
}

let a = [3, 4, 2, 23, 12, 5, 32, 22];
selectionSort(a);
