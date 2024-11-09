package array;

import java.util.HashSet;

public class RemoveDup {
    static int RemoveDup1(int arr[]) {
        int k = 0, i = 0, j;
        for (j = i + 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                k++;
                arr[i] = arr[j];
            }
        }
        return k + 1;
    }

    static int RemoveDup2(int arr[]) {
        HashSet<Integer> array_set = new HashSet<Integer>();
        for (int ele : arr) {
            array_set.add(ele);
        }
        return array_set.size();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 4 };
        System.out.println(RemoveDup1(arr));
        System.out.println(RemoveDup2(arr));

    }
}
