package Backend;

import com.sun.rowset.internal.Row;
import java.util.ArrayList;
import java.util.List;

public class knight extends piece {

    public knight(int row, int coloumn, Square[][] BoardSquares, char colour) {
        super(row, coloumn, BoardSquares, colour);

    }

    @Override
    public List<Square> legalMoves() {

        List<Square> resultList = new ArrayList<Square>();

        if ((getRow() + 2) < 8 && (getColoumn() - 1) > -1) {

            Square sq = BoardSquares[getRow() + 2][getColoumn() - 1];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }

        }
        if ((getRow() + 2) < 8 && (getColoumn() + 1) < 8) {
            Square sq = BoardSquares[getRow() + 2][getColoumn() + 1];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }

        if ((getRow() - 2) > -1 && (getColoumn() - 1) > -1) {
            Square sq = BoardSquares[getRow() - 2][getColoumn() - 1];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }

        if ((getRow() - 2) > -1 && (getColoumn() + 1) < 8) {
            Square sq = BoardSquares[getRow() - 2][getColoumn() + 1];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }
        if ((getRow() + 1) < 8 && (getColoumn() + 2) < 8) {
            Square sq = BoardSquares[getRow() + 1][getColoumn() + 2];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }
        if ((getRow() - 1) > -1 && (getColoumn() + 2) < 8) {
            Square sq = BoardSquares[getRow() - 1][getColoumn() + 2];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }
        if ((getRow() + 1) < 8 && (getColoumn() - 2) > -1) {
            Square sq = BoardSquares[getRow() + 1][getColoumn() - 2];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }
        if ((getRow() - 1) > -1 && (getColoumn() - 2) > -1) {
            Square sq = BoardSquares[getRow() - 1][getColoumn() - 2];
            if (sq.getPiece() == null) {
                resultList.add(sq);
            } else if (sq.getPiece().colour != this.colour) {
                resultList.add(sq);
            }
        }

        return resultList;
    }
}
