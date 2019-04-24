package Backend;


import java.util.*;

public class Board
{

    //Data
    public Square[][] BoardSquares = new Square[8][8];
    List<Square> dead = new ArrayList<Square>(); 
    public Board()
    {

        for (int j = 0; j <= 7; j++)
        {
            BoardSquares[1][j] = new Square(1, j, new pawn(1, j, BoardSquares, 'B'));

            BoardSquares[6][j] = new Square(6, j, new pawn(6, j, BoardSquares, 'W'));
        }

        BoardSquares[0][0] = new Square(0, 0, new rook(0, 0, BoardSquares, 'B'));
        BoardSquares[0][7] = new Square(0, 7, new rook(0, 7, BoardSquares, 'B'));
        BoardSquares[7][0] = new Square(7, 0, new rook(7, 0, BoardSquares, 'W'));
        BoardSquares[7][7] = new Square(7, 7, new rook(7, 7, BoardSquares, 'W'));

        BoardSquares[0][1] = new Square(0, 1, new knight(0, 1, BoardSquares, 'B'));
        BoardSquares[0][6] = new Square(0, 6, new knight(0, 6, BoardSquares, 'B'));
        BoardSquares[7][1] = new Square(7, 1, new knight(7, 1, BoardSquares, 'W'));
        BoardSquares[7][6] = new Square(7, 6, new knight(7, 6, BoardSquares, 'W'));

        BoardSquares[0][2] = new Square(0, 2, new rook(0, 2, BoardSquares, 'B'));
        BoardSquares[0][5] = new Square(0, 5, new rook(0, 5, BoardSquares, 'B'));
        BoardSquares[7][2] = new Square(7, 2, new rook(7, 2, BoardSquares, 'W'));
        BoardSquares[7][5] = new Square(7, 5, new rook(7, 5, BoardSquares, 'W'));

        BoardSquares[0][3] = new Square(0, 3, new queen(0, 3, BoardSquares, 'B'));
        BoardSquares[7][3] = new Square(7, 3, new queen(7, 3, BoardSquares, 'W'));
        

        //BoardSquares[0][4] = new Square (0,4,new king(0,4,BoardSquares,'W'));
        //BoardSquares[7][4] = new Square (7,4,new king(7,4,BoardSquares,'B'));
     for (int i=2 ; i<6;i++)
     {
         for(int j=0;j<8;j++)
         {
             BoardSquares[i][j]= new Square(i,j);
         }
     }
    }
}
