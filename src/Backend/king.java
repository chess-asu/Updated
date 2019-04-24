package Backend;

import java.util.ArrayList;
import java.util.List;

 class King extends piece
{

    public King(int row, int coloumn, Square[][] BoardSquares, char colour)
    {
        super(row, coloumn, BoardSquares, colour);
    }

    public List<List> allNextMovesEnemy(Square[][] BoardSquare) //detect all next moves for all enemies to eliminate them from king legal m,oves
    {
        List<List> resultList = new ArrayList<List>();
        if (this.colour == 'W')
        {
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if (BoardSquare[i][j].getPiece().colour == 'W' || BoardSquare[i][j].getPiece() == null)
                    {
                        continue;
                    }
                    resultList.add(BoardSquare[i][j].getPiece().legalMoves());
                }
            }

        }
        else
        {
            for (int i = 0; i < 8; i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    if (BoardSquare[i][j].getPiece().colour == 'B' || BoardSquare[i][j].getPiece() == null)
                    {
                        continue;
                    }
                    resultList.add(BoardSquare[i][j].getPiece().legalMoves());
                }
            }
        }

        return resultList;
    }

    

    public List<Square> availableMoves()
    {
        List<Square> resultList = new ArrayList<Square>();
        List<Square> resultlist = new ArrayList<Square>();

        if (getRow() + 1 < 8) //forward
        {
            Square sq = BoardSquares[getRow() + 1][getColoumn()];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour) /// check again
                {
                    resultList.add(sq);
                }
            }
        }
        if ((getRow() + 1) < 8 && (getColoumn() - 1) > -1) //forward left
        {
            Square sq = BoardSquares[getRow() + 1][getColoumn() + 1]; //check againn +2
            if (sq.getPiece().colour != this.colour || sq.getPiece() == null)
            {
                resultList.add(sq);
            }
        }
        if ((getRow() + 1) < 8 && (getColoumn() + 1) < 8) //forward right
        {
            Square sq = BoardSquares[getRow() + 1][getColoumn() + 1]; //check again +2

            if (sq.getPiece().colour != this.colour || sq.getPiece() == null)
            {
                resultList.add(sq);
            }
        }
        if ((getRow() - 1) < 8) // backward  lesa na2es
        {
            Square sq = BoardSquares[getRow() - 1][getColoumn()];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour)
                {
                    resultList.add(sq);
                }
            }
        }
        if ((getColoumn() - 1) < 8) // left 
        {
            Square sq = BoardSquares[getRow()][getColoumn() - 1];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour)
                {
                    resultList.add(sq);
                }
            }
        }
        if ((getColoumn() + 1) < 8) // right  l
        {
            Square sq = BoardSquares[getRow()][getColoumn() + 1];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour)
                {
                    resultList.add(sq);
                }
            }
        }
        if ((getColoumn() - 1) < 8 && getRow() - 1 < 8) // left  back
        {
            Square sq = BoardSquares[getRow() - 1][getColoumn() - 1];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour)
                {
                    resultList.add(sq);
                }
            }
        }
        if ((getColoumn() + 1) < 8 && getRow() - 1 < 8) // right back
        {
            Square sq = BoardSquares[getRow() - 1][getColoumn() + 1];
            if (sq.getPiece() == null)
            {
                resultList.add(sq);
            }
            else
            {
                if (sq.getPiece().colour != this.colour)
                {
                    resultList.add(sq);
                }
            }
        }

        return resultList;

    }
    @Override
   public List<Square> legalMoves(  )
   {
        return null;
       
   }
}


