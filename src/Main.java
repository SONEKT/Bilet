import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 31, 5, 15, 61, 1, 25};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] ++;
            }
        }
        for (int i = 2; i < 7; i++) {
            System.out.println(numbers[i]);
        }
    }
}