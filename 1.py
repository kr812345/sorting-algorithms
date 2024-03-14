arr = [3,234,34,5,32,199,2999,4,54]
n = len(arr)
for i in range(n-1):
    for j in range(n-i-1):
        if ( arr[j] > arr[j+1]):
            temp = arr[j]
            arr[j] = arr[j+1]
            arr[j+1] = temp
print(arr)