public class SortAllZeros {
    static void sortAllZeros(int arr[]) {
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[j++] = arr[i];

            }
        } // o(n)
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
            if (i != arr.length - 1) {
                System.out.print(" , ");
            }
        } // o(n)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1, 10, 0 };
        sortAllZeros(arr);
    }
}
