package Backend;

import java.util.List;


public abstract class  piece {
 
  int id;
  protected  static int count =1;
  int row ;
  int coloumn ;
  Square [][] BoardSquares ; 
  protected    char colour ;
  boolean alive;
  public static int removed=0;
   
    public piece(int row , int coloumn , Square [][] BoardSquares , char colour){
        this.BoardSquares = BoardSquares ;
        id=count++;
        this.row = row;
     this.coloumn= coloumn;
     this.colour = colour;
        
    }
    
    public int getRow()
     {
         return row ;
     }

    public int getId() {
        return id;
    }

    public char getColour() {
        return colour;
    }
    public int getColoumn()
     {
         return coloumn ;
     }

    public abstract List<Square> legalMoves(  ) ;
    
    public  void setPosition(Square square){
    
     this.row =  (square.getRow());
     this.coloumn =(square.getColoumn());
 
    }
    public boolean move(List<Square> available, Square s, List<Square> dead){
         if(available.contains(s)) //check if selected square is available
         {   
            if ( s.getPiece()==null) //if square is fady han2el 3aleh el piece
             {
                 this.setPosition(s);
                 s.setPiece(this);
             }
             else { //if not fady hakol el piece el 3aleh
             //assign square on dead list with removed piece
             dead.get(removed++).setPiece(s.getPiece()); 
             setPosition(s); 
             s.setPiece(this);
             }
            return true; //boolean is a flag to move was successful or not
         }
         return false;
     }
}