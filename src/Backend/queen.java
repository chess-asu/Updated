package Backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class queen extends piece {
    public queen(int row , int coloumn,Square[][] BoardSquares, char colour) 
   { super(row,coloumn,BoardSquares,colour);
     
       
   }
  
 @Override 
 public List<Square> legalMoves(  ) 
 {

     
     List<Square> resultList = new ArrayList<Square>();

 for(int i=0 ;i<8;i++)
     {
 
     if((getRow()+i)<8) // 
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
         { 
             break;
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
    
     
 }  int r=getRow() ;
   int c=getColoumn();  
   int j = c+1;
   int i = r+1;
   for(  ; i<8 && j<8 ; i++ , j++ )  // up right 
   { 
       Square sq = BoardSquares[i][j] ;
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
   i=r-1;
    j= c-1;
    for(  ;i>-1 && j>-1 ; i--,j--)  //down left
    {  Square sq = BoardSquares[i][j] ;
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
    i=r+1;
    j= c-1;
    for( ;i<8&& j>-1 ; i++ ,j--) //up left
    {
        Square sq = BoardSquares[i][j] ;
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
    i=r-1;
    j= c+1;
    for( ; i>-1 && j<8 ; i-- , j++ ) // down right
    {         Square sq = BoardSquares[i][j] ;
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
  return resultList;
 }
 

    
}
