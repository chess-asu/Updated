public class PieceSet {
  
    String colour;
    Piece[] listOfPieces = new Piece[32];
  private void makeListOfPieces()
  {
  
  
 for(int i=0 ; i<=7 ; i++)
   {
       listOfPieces[i]= new pawn(2,i,"W");
       listOfPieces[i+15]= new pawn(7,i,"B");
   }
 
       listOfPieces[8]= new rook(1,1,"W");
       listOfPieces[9]= new rook(1,8,"W");
       listOfPieces[24]= new rook(8,1,"B");
       listOfPieces[25]= new rook(8,8,"B");
       
       listOfPieces[10]= new knight(1,2,"W");
       listOfPieces[11]= new knight(1,7,"W");
       listOfPieces[26]= new knight(8,2,"B");
       listOfPieces[27]= new knight(8,7,"B");
       
       listOfPieces[12]= new bishop(1,3,"W");
       listOfPieces[13]= new bishop(1,6,"W");
       listOfPieces[28]= new bishop(8,3,"B");
       listOfPieces[29]= new bishop(8,6,"B");
       
       
       listOfPieces[14]= new queen (1,4,"W");
       listOfPieces[30]= new queen (8,4,"B");
       
       
       listOfPieces[15]= new king(1,5,"W");
       listOfPieces[31]= new king(8,5,"B");
       

  } 
}