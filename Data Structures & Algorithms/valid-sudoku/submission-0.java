class Solution {
    static int MAX_ROWS = 9;
    static int MAX_COLS = 9;

    private boolean checkRow(char[][] board, int row) {
        HashSet<Character> set = new HashSet<>();

        for (int col = 0; col < MAX_COLS; col++) {
            char ch = board[row][col];

            if (ch != '.') {
                if (set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }

        return true;
    }

    private boolean checkCol(char[][] board, int col) {
        HashSet<Character> set = new HashSet<>();

        for (int row = 0; row < MAX_ROWS; row++) {
            char ch = board[row][col];

            if (ch != '.') {
                if (set.contains(ch)) {
                    return false;
                }
                set.add(ch);
            }
        }

        return true;
    }

    private boolean checkBox(char[][] board, int startRow, int startCol) {
        HashSet<Character> set = new HashSet<>();

        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                char ch = board[row][col];

                if (ch != '.') {
                    if (set.contains(ch)) {
                        return false;
                    }
                    set.add(ch);
                }
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < MAX_ROWS; i++) {
            if (!checkRow(board, i)) {
                return false;
            }
        }

        for (int j = 0; j < MAX_COLS; j++) {
            if (!checkCol(board, j)) {
                return false;
            }
        }

        for (int row = 0; row < MAX_ROWS; row += 3) {
            for (int col = 0; col < MAX_COLS; col += 3) {
                if (!checkBox(board, row, col)) {
                    return false;
                }
            }
        }

        return true;
    }
}