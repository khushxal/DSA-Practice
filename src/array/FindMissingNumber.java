public class FindMissingNumber {
    static int findMissingNumber(int arr[]) {
        int n = arr[arr.length - 1], sum = 0;
        int sumOfNatural = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum = sum + num;
        }
        ;
        if (sumOfNatural - sum == 0) {
            return -1;
        }
        return sumOfNatural - sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 6 };
        System.out.println(findMissingNumber(arr));
    }
}
