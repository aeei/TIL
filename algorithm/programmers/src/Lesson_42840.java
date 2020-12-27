import java.util.Arrays;

public class Lesson_42840 {
    public static int[] solution(int[] answers) {
        final int[] mathHater1 = {1, 2, 3, 4, 5}; // 5
        final int mathHater1PatternLength = mathHater1.length;
        final int[] mathHater2 = {2, 1, 2, 3, 2, 4, 2, 5}; // 8
        final int mathHater2PatternLength = mathHater2.length;
        final int[] mathHater3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
        final int mathHater3PatternLength = mathHater3.length;
        final int[] corrects = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            int answer = answers[i];
            if (answer == mathHater1[i % mathHater1PatternLength]) corrects[0]++;
            if (answer == mathHater2[i % mathHater2PatternLength]) corrects[1]++;
            if (answer == mathHater3[i % mathHater3PatternLength]) corrects[2]++;
        }

        int max = 0;
        for (int correct : corrects) {
            if (correct > max) {
                max = correct;
            }
        }

        int answerLength = 0;
        for (int correct : corrects) {
            if (correct == max) {
                answerLength++;
            }
        }

        int[] answer = new int[answerLength];
        int answerIndex = 0;
        for (int i = 0; i < corrects.length; i++) {
            if (corrects[i] == max) {
                answer[answerIndex++] = i + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(solution(answers)));
    }
}
