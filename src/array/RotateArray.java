package array;

public class RotateArray {
    static void leftRotateArray(int arr[]) {
        int temp = 0;
        temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void rightRotateArray(int arr[]) {
        int temp = 0;
        temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        // leftRotateArray(array);
        System.out.println();
        rightRotateArray(array);
    }
}
