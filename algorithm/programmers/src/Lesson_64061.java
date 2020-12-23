public class Lesson_64061 {
    public static int solution(int[][] board, int[] moves) {
        int explosionCount = 0;
        int[] currentRowIndex = new int[board.length];
        int[] stack = new int[moves.length];

        for (int c = 0; c < board.length; c++) {
            for (int r = 0; r < board.length; r++) {
                int value = board[r][c];
                if (value != 0) {
                    currentRowIndex[c] = r;
                    break;
                }
            }
        }

        int stackTop = 0;
        for (int i = 0; i < moves.length; i++) {
            int c = moves[i] - 1;
            int r = currentRowIndex[c]++;

            if (r < board.length) {
                stack[stackTop] = board[r][c];

                if (stackTop > 0 && stack[stackTop] == stack[stackTop - 1]) {
                    explosionCount++;
                    stackTop--;
                } else {
                    stackTop++;
                }
            }
        }

        return explosionCount * 2;
    }

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(solution(board, moves));
    }
}
