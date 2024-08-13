import java.util.Random;
import java.util.Scanner;

public class MergeSort {

    static final int MAX = 10005;
    static int[] a = new int[MAX];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Max array size: ");
        int n = input.nextInt();
        Random random = new Random();
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            // Alternatively, you can generate random elements
            // a[i] = random.nextInt(1000);
        }
        long startTime = System.nanoTime();
        MergeSortAlgorithm(0, n - 1);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time complexity (ms) for n = " + n + " is: " + (double) elapsedTime / 1000000);

        System.out.println("Sorted Array (Merge Sort): ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        input.close();
    }

    public static void MergeSortAlgorithm(int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            MergeSortAlgorithm(low, mid);
            MergeSortAlgorithm(mid + 1, high);
            Merge(low, mid, high);
        }
    }

    public static void Merge(int low, int mid, int high) {
        int[] b = new int[MAX];
        int i = low, h = low, j = mid + 1;

        while (h <= mid && j <= high) {
            if (a[h] <= a[j]) {
                b[i++] = a[h++];
            } else {
                b[i++] = a[j++];
            }
        }

        while (h <= mid) {
            b[i++] = a[h++];
        }

        while (j <= high) {
            b[i++] = a[j++];
        }

        for (i = low; i <= high; i++) {
            a[i] = b[i];
        }
    }
}