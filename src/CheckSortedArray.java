public class CheckSortedArray {
    static boolean checkArraySorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 18, 12, 1, 8 };
        System.out.println(checkArraySorted(arr1));
        int arr2[] = { 2, 4, 6, 8, 10 };
        System.out.println(checkArraySorted(arr2));
    }
}
