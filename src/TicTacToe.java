import java.util.Scanner;
class Tictactoe
{
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board [][] = new String[ROW][COL];

    private static void clearBoard()
    {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = " ";
    }

    public static void display()
    {

        for(int row = 0; row < 3; row++) {
            System.out.print(row + 1);
            for (int col = 0; col < 3; col++) {
                System.out.print("" + board[row][col] + "");
                if (col != 2)
                    System.out.print("   |");
            }
            System.out.println();
            if (row != 2){
                System.out.println(" ____|____|____");
                System.out.println("     |    |   ");
            }
        }
        System.out.println();
    }
    private static boolean isValidMove(int row, int col)
    {
        if (row>=0 && row<ROW && col>=0 && col<COL && board[row][col].equals(" "))
            return true;

        return false;
    }
    private static boolean isWin(String player)
    {
        if(isColWin(player) || isRowWin(player) || isDiagonalWin(player))
            return true;
        return false;
    }
    private static boolean isColWin(String player)
    {
        for(int col=0; col<COL; col++)
        {
            if(board[0][col].equals(player) && board[0][col].equals(board[1][col]) && board[1][col].equals(board[2][col]))
                return true;
        }
        return false;
    }
    private static boolean isRowWin(String player)
    {
        for(int row=0; row<ROW; row++)
        {
            if(board[row][0].equals(player) && board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]))
                return true;
        }
        return false;
    }


    private static boolean isDiagonalWin(String player)
    {
        if(board[1][1].equals(player) && ((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) ||
                (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))))
            return true;
        return false;
    }
    private static boolean isTie()
    {
        for(int row=0; row<ROW; row++)
        {
            for(int col=0; col<COL; col++)
            {
                if(board[row][col].equals(" "))
                    return false;
            }
        }
        return true;
    }
 private static String togglePlayer(String player)
    {
        if(player.equals("X"))
            return "O";
        else
            return "X";
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String player;
        int row, col;

        do
        {
            clearBoard();
            player = "X";

            while(!isWin("X") && !isWin("O") && !isTie())
            {
                display();

                row = SafeInputs.getRangeInt(console, "Player "+player+", enter row number: ", 1, ROW);
                col = SafeInputs.getRangeInt(console, "Player "+player+", enter column number: ", 1, COL);

                while(!isValidMove(row-1,col-1))
                {
                    System.out.println("The position is already occupied. Please enter again");
                    row = SafeInputs.getRangeInt(console, "Player "+player+", enter row number: ", 1, ROW);
                    col = SafeInputs.getRangeInt(console, "Player "+player+", enter column number: ", 1, COL);
                }

                board[row-1][col-1] = player;

                if(isWin(player))
                    break;
                player = togglePlayer(player);
            }
            display();

            if(isWin(player))
                System.out.println("Player "+player +" wins!");
            else
                System.out.println("Its a tie!");
            System.out.println();

        }while(SafeInputs.getNYConfirm(console, "Do you want to play another game (Y/N)? "));

        console.close();
    }
}