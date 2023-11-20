import java.util.Arrays;
import java.util.Random;

public class ArrayShuffler {

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);  // Generate a random index between 0 and i (inclusive)
            int temp = array[i]; // Swap array[i] with the element at randomIndex
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array: " + Arrays.toString(myArray));
        shuffleArray(myArray); // Shuffle the array
         System.out.println("Shuffled Array: " + Arrays.toString(myArray)); // Display the shuffled array
    }
}
