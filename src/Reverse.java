
import java.util.Arrays;
public class Reverse {
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 1, 2, 9, 4, 7, 6};

            // reverse the array
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }

            // print the reversed array
            System.out.println(Arrays.toString(arr));
        }


}
