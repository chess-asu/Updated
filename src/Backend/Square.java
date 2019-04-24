package Backend;


import java.util.List;

public class Square {
    
    private int row ;
    private int coloumn;
   // private char state; // b or w or f or k
    private piece Piece ;
    
    public Square ( int row , int coloumn)
    {
      this.row = row;
      this.coloumn=coloumn;  
       
    }
    public Square(int row,int coloumn,piece Piece)
    {
        this.row = row;
        this.coloumn=coloumn;
        this.Piece = Piece;
       
    }            
     public int getRow ()
                {
                   return row; 
                }
    public int getColoumn()
    {
        return coloumn;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColoumn(int coloumn) {
        this.coloumn = coloumn;
    }

  /*  public void setState(char state) {
        this.state = state;
    } */
    
  /*  public char getState() {
        return state;
    } */ 
    public piece getPiece()
    {
        return Piece ;
        
    }
    public void setPiece(piece Piece )
    {
        this.Piece = Piece ;
        
    }
}
    
