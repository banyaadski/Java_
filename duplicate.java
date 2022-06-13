package Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = { 1,0,2,3,0,4,5,0 };
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) count += 1;
        }
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == 0) {
                list.add(arr[i]);
                list.add(0);
            } else list.add(arr[i]);

        }
        System.out.println((list));
    }

}
