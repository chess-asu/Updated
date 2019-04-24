package Backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class pawn extends piece{ 
    public pawn(int row , int coloumn,Square[][] BoardSquares, char colour) 
   { super(row,coloumn,BoardSquares,colour);

       
   }
   
 @Override 
 public List<Square> legalMoves(  ) 
 {

     
     List<Square> resultList = new ArrayList<Square>();

     
 
     // i should write a special case for the first step of pawn

     if((getRow()+1)<8) // Normal move 
     {   Square sq = BoardSquares[getRow()+1][getColoumn()] ;
         if(sq.getPiece() == null)
       {
           resultList.add(sq) ;
       }
       else if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
       }
     }     
     if((getRow()+1)<8 && (getColoumn()-1)>-1) //attacking 
     {   Square sq = BoardSquares[getRow()+2][getColoumn()+1] ;
        if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
       }
     }   
     if((getRow()+1)<8&& (getColoumn()+1)<8) //attacking
     {  Square sq = BoardSquares[getRow()+2][getColoumn()+1] ;
     
       if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
       }
     }
     
     
 
  return resultList;
 }
 

}