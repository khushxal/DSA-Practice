package array;

public class LargestEle {
    public static int largestEle(int arr[]) {
        int max = arr[0];
        for (int ele : arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 18, 12, 1, 8 };
        System.out.println(largestEle(arr));
    }
}
