package Java;

public class InsertionSort {
    public static int[] insertionSort(int[] array){
        for(var i = 1; i < array.length; i++){
            var current = array[i];
            var j = i - 1;

            while(j >= 0 && array[j] > current){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 10};
        var sortedArray = insertionSort(array);
        for(var i = 0; i < sortedArray.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
}