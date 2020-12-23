import java.util.Arrays;
import java.util.stream.IntStream;

public class Lesson_68644 {
    public static int[] solution(int[] numbers) {
        int[] sums = new int[(numbers.length - 1) * numbers.length / 2];
        int sumIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sums[sumIndex] = numbers[i] + numbers[j];
                sumIndex++;
            }
        }

        return IntStream.of(sums).distinct().sorted().toArray(); // 직접 구현해야 하는데..?
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }
}