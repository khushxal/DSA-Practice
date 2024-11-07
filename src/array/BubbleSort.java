public class BubbleSort {

    static int[] bubble_Sort(int array[]) {
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = 0;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 8, 7, 90, 1, 9 };
        bubble_Sort(arr);
    }
}
