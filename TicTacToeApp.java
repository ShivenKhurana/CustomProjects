import java.util.Scanner;

public class TicTacToeApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char[][] board = { { '.', '.', '.' }, { '.', '.', '.' }, { '.', '.', '.' } };
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		int count = 1;
		boolean s = false;
		while (!s && count <= 9) {

			printTextPlayer1(scanner, board);
			displayAndInput(scanner, board, 'X');
			s = winnerCheck(scanner, board);
			if (s)
				break;
			printTextPlayer2(scanner, board);
			displayAndInput(scanner, board, 'O');
			s = winnerCheck(scanner, board);
			count++;

		}
	}

	public static int getInput(Scanner scanner, String coordinateType) {
		int X = 0;
		do {
			System.out.println("Enter an " + coordinateType + " coordinate value from 0-2 " + coordinateType + ": ");
			X = scanner.nextInt();
		} while (X > 2 || X < 0);
		return X;
	}

	public static void displayAndInput(Scanner scanner, char[][] board, char xO) {
		boolean success = true;
		int X = -1;
		int Y = -1;
		do {

			X = getInput(scanner, "X");
			Y = getInput(scanner, "Y");
			if (board[X][Y] != '.') {
				System.out.println("Someone has already made a move here, please move again!");
				success = false;
			}
		} while (!success);
		board[X][Y] = xO;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();

		}

	}

	public static boolean winnerCheck(Scanner scanner, char[][] board) {
		 boolean check = false;
		if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
			System.out.println("Player 1 has won"); // Horizontal X
			check = true;
			System.out.println(check);

		}
		if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
			System.out.println("Player 1 has won"); // Horizontal X
			check = true;

		}
		if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
			System.out.println("Player 1 has won"); // Horizontal X
			check = true;

		}
		if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
			System.out.println("Player 2 has won"); // Horizontal O
			check = true;

		}
		if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
			System.out.println("Player 2 has won"); // Horizontal O
			check = true;

		}
		if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
			System.out.println("Player 2 has won"); // Horizontal O
			check = true;

		}
		if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
			System.out.println("Player 1 has won"); // Vertical X
			check = true;
		}
		if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
			System.out.println("Player 1 has won"); // Vertical X
			check = true;
		}
		if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
			System.out.println("Player 1 has won"); // Vertical X
			check = true;
		}
		if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
			System.out.println("Player 2 has won"); // Vertical O
			check = true;
		}
		if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
			System.out.println("Player 2 has won"); // Vertical O
			check = true;
		}
		if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
			System.out.println("Player 2 has won"); // Vertical O
			check = true;
		}
		if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
			System.out.println("Player 1 has won"); // DiagonalRight X
			check = true;
		}
		if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			System.out.println("Player 1 has won"); // DiagonalLeft X
			check = true;
		}
		if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
			System.out.println("Player 2 has won"); // DiagonalRight O
			check = true;
		}
		if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			System.out.println("Player 2 has won"); // DiagonalLeft O
			check = true;
		}
		return check;

	}

	public static void printTextPlayer1(Scanner scanner, char[][] board) {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("-----------Player 1's Turn-----------");
		System.out.println(" ");
	}

	public static void printTextPlayer2(Scanner scanner, char[][] board) {
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("-----------Player 2's Turn-----------");
		System.out.println(" ");
	}
}
