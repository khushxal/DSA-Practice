package knowbasicmaths;

public class ReverseArray {
    static void reverseArray(int arr[]) {
        StringBuilder stbr = new StringBuilder();
        for (int i = arr.length; i > 0; i--) {
            stbr.append(String.valueOf(arr[i - 1])).append(" ");
        }

        System.out.println(stbr);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 7 };
        reverseArray(arr);
    }
}
