package Backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class rook extends piece {
     public rook(int row , int coloumn,Square[][] BoardSquares, char colour) 
   { super(row,coloumn,BoardSquares,colour);
  
       
   }
   
 @Override 
 public List<Square> legalMoves(  ) 
 {

     
     List<Square> resultList = new ArrayList<Square>();

     
     for(int i=0 ;i<8;i++)
     {
 
     if((getRow()+i)<8) // at2kd hena ano msh hykhrog bra l board 
     {  

          Square sq = BoardSquares[getRow()+i][getColoumn()] ;
         if(sq.getPiece() == null)
       {
           resultList.add(sq) ;
       }
       else if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
            break;
       }
          else 
          { break;
          }
         
     }   
      if((getRow()-i)>-1)
     {  Square sq = BoardSquares[getRow()-i][getColoumn()+1] ;
         if(sq.getPiece() == null)
       {
           resultList.add(sq) ;
       }
       else if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
            break;
       }
      else 
      {
           break;
      }
     }  
      if(getColoumn()+i<8)
          
      {
           Square sq = BoardSquares[getRow()][getColoumn()+i] ;
         if(sq.getPiece() == null)
       {
           resultList.add(sq) ;
       }
       else if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
            break;
       }
           else 
           {
                break;
           }
      }
     
      if(getColoumn()-i > -1)
      {
           Square sq = BoardSquares[getRow()][getColoumn()-i] ;
         if(sq.getPiece() == null)
       {
           resultList.add(sq) ;
       }
       else if(sq.getPiece().colour != this.colour) 
       {
           resultList.add(sq) ;
            break;
       }
           else 
           {
                break;
           }
      }
    
     
 }  
         
  return resultList;
 }
 

}
