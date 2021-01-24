// TicTacToe needs a board to play on
// this is the board for TicTacToe

public abstract class Board {
	// this is the multi-dimensional array to hold the board's move choices; must be static
	static String[][] board = new String[3][3];

	// prints the game board; must be static
    static void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" |");
		System.out.println("|-----------|");
		System.out.println("| "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" |");
		System.out.println("\\---|---|---/");
    }
}

// Disclaimer:
// The given assignment description, project files, code files and/or solution files
// should not be made available in a public form via methods such as online hosting
// in code repositories, educational resource hosting websites, etc. These projects
// and related files can be hosted in private repositories for situations such as
// showing example work at job interviews, personal reference for future class
// projects, etc.