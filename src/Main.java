public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 12, 45, 567, 12};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] ++;
            }
        }
        for (int i = 2; i <7; i++){
            System.out.println(numbers[i]);
        }
    }
}