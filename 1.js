// Bubble sort

let arr = [3,234,34,5,32,199,2999,4,54];
n = arr.length;
for (i = 0; i < n - 1; i++) {
    for (j = 0; j < n - i - 1; j++) {
        if ( arr[j] > arr[j+1]) {
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}

console.log(arr);