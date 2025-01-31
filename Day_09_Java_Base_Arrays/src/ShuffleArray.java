import java.util.Scanner;
import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        // Create a result array of the same size
        int[] result = new int[2 * n];

        // Iterate through both halves of the array and interleave elements
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];        // Add x_i to the result
            result[2 * i + 1] = nums[i + n]; // Add y_i to the result
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Create an array of size 2n
        int[] nums = new int[2 * n];

        // Input the array elements
        System.out.println("Enter the elements of the array (size " + (2 * n) + "):");
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Call the shuffle method
        int[] result = shuffle(nums, n);

        // Print the shuffled result
        System.out.println("Shuffled array: " + Arrays.toString(result));
    }
}
