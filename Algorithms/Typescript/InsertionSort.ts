function insertionSort(array: Array<number>): Array<number> {
    
    for (let i = 1; i < array.length; i++) {
        let current = array[i];
        let j = i - 1;

        while (j >= 0 && array[j] > current) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = current;
    }
    
    return array;
}

console.log(insertionSort([3, 2, 10, 1]));