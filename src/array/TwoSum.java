public class TwoSum {

    public static boolean twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 1, 0, 5 };
        int target = 0;
        System.out.println(
                twoSum(arr, target));
    }
}
