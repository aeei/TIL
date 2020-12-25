import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson_42576 {
    public static String solution_1(String[] participant, String[] completion) {
        int cnt = 0;

        for (int i = 0; i < participant.length; i++) {
            for (int j = cnt; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {

                    String temp = participant[cnt];
                    participant[cnt] = participant[i];
                    participant[i] = temp;

                    temp = completion[cnt];
                    completion[cnt] = completion[j];
                    completion[j] = temp;

                    cnt++;
                    break;
                }
            }
        }

        return participant[participant.length - 1];
        /*
        정확성  테스트
        테스트 1 〉	통과 (0.02ms, 52.6MB)
        테스트 2 〉	통과 (0.02ms, 53.1MB)
        테스트 3 〉	통과 (2.96ms, 52.8MB)
        테스트 4 〉	통과 (10.89ms, 52.7MB)
        테스트 5 〉	통과 (13.25ms, 52.6MB)
        효율성  테스트
        테스트 1 〉	실패 (시간 초과)
        테스트 2 〉	실패 (시간 초과)
        테스트 3 〉	실패 (시간 초과)
        테스트 4 〉	실패 (시간 초과)
        테스트 5 〉	실패 (시간 초과)
        */
    }

    public static String solution_2(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[participant.length - 1];
        /*
        정확성  테스트
        테스트 1 〉	통과 (0.29ms, 51.9MB)
        테스트 2 〉	통과 (0.34ms, 52.9MB)
        테스트 3 〉	통과 (2.99ms, 53.8MB)
        테스트 4 〉	통과 (6.05ms, 53.2MB)
        테스트 5 〉	통과 (5.65ms, 53.2MB)
        효율성  테스트
        테스트 1 〉	통과 (173.94ms, 81.5MB)
        테스트 2 〉	통과 (230.65ms, 89MB)
        테스트 3 〉	통과 (272.48ms, 94.6MB)
        테스트 4 〉	통과 (324.93ms, 96.2MB)
        테스트 5 〉	통과 (304.51ms, 95.7MB)
        */
    }

    public static String solution_3(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) return entry.getKey();
        }

        throw new RuntimeException("error");
        /*
        정확성  테스트
        테스트 1 〉	통과 (0.08ms, 52.1MB)
        테스트 2 〉	통과 (0.08ms, 53.4MB)
        테스트 3 〉	통과 (0.69ms, 52.5MB)
        테스트 4 〉	통과 (1.34ms, 54.8MB)
        테스트 5 〉	통과 (1.20ms, 54.4MB)
        효율성  테스트
        테스트 1 〉	통과 (46.21ms, 81.5MB)
        테스트 2 〉	통과 (71.98ms, 88.8MB)
        테스트 3 〉	통과 (96.42ms, 95.5MB)
        테스트 4 〉	통과 (81.19ms, 95.2MB)
        테스트 5 〉	통과 (71.25ms, 96MB)
        */
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution_3(participant, completion));
    }
}
