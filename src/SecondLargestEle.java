public class SecondLargestEle {

    static int secondLargestEle(int arr[]) {
        int fmax = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > fmax) {
                fmax = ele;
            }
        }
        for (int ele : arr) {
            if (ele > smax && ele != fmax) {
                smax = ele;
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 8, 12, 12, 1, 8 };
        System.out.println(secondLargestEle(arr));
    }
}
