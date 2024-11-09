package array;

public class LinearSearch {
    static void linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at " + (i) + " index.");
                return;
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 56, 89, 12, 2 };
        linearSearch(arr, 2);
    }
}
