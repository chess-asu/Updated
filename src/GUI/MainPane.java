package GUI;

import Backend.*;
import java.util.List;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import static javafx.scene.layout.GridPane.REMAINING;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

class MainPane extends BorderPane {

    CenterPane CP;
    LeftPane LP;
    RightPane RP;
    TopPane TP;
    BottomPane BP;

    public MainPane() {
        CP = new CenterPane();
        setCenter(CP);
        LP = new LeftPane();
        setLeft(LP);
        RP = new RightPane();
        setRight(RP);
        BP = new BottomPane();
        setBottom(BP);
        TP = new TopPane();
        setTop(TP);
        CP.setAlignment(Pos.CENTER);
    }

    class CenterPane extends GridPane {

        Board Board = new Board();

        CenterPane() {

            Rectangle[][] WhiteAndBlack = new Rectangle[8][8];

            for (int i = 0; i < 8; i++) //for loop to create all squares and allocate them in the gridpane
            {
                for (int j = 0; j < 8; j++) {
                    WhiteAndBlack[i][j] = new Rectangle(75, 75);
                    if ((i + j) % 2 == 0) {
                        WhiteAndBlack[i][j].setFill(Color.BROWN);
                    } else {
                        WhiteAndBlack[i][j].setFill(Color.LIGHTBLUE);
                    }
                    add(WhiteAndBlack[i][j], i, j);

                    for (int k = 0; k < 8; k++) // import white pawns
                    {
                        add(new ImageView("Images/wp.png"), k, 6);
                    }
                    for (int k = 0; k < 8; k++) // import black pawns
                    {
                        add(new ImageView("Images/bp.png"), k, 1);
                    }
                    add(new ImageView("Images/wr.png"), 0, 7); //create white rook left corner
                    add(new ImageView("Images/wh.png"), 1, 7); //create white horse left corner
                    add(new ImageView("Images/wb.png"), 2, 7);//create white bishop left corner
                    add(new ImageView("Images/wr.png"), 7, 7);//create white rook right corner
                    add(new ImageView("Images/wh.png"), 6, 7);//create white horse right corner
                    add(new ImageView("Images/wb.png"), 5, 7);//create white bishop right corner
                    add(new ImageView("Images/wq.png"), 3, 7);//create white queen
                    add(new ImageView("Images/wk.png"), 4, 7);//create white king right corner
                    //now black pieces
                    add(new ImageView("Images/br.png"), 0, 0); //create black rook left corner
                    add(new ImageView("Images/bh.png"), 1, 0); //create black horse left corner
                    add(new ImageView("Images/bb.png"), 2, 0);//create black bishop left corner
                    add(new ImageView("Images/br.png"), 7, 0);//create black rook right corner
                    add(new ImageView("Images/bh.png"), 6, 0);//create black horse right corner
                    add(new ImageView("Images/bb.png"), 5, 0);//create black bishop right corner
                    add(new ImageView("Images/bq.png"), 3, 0);//create black queen
                    add(new ImageView("Images/bk.png"), 4, 0);//create black king right corner

                }
            }
            setOnMousePressed((MouseEvent event) -> {
                Node clickedNode = event.getPickResult().getIntersectedNode();
                {
                    //Show Legal Moves and Print Square ID
                    Integer colIndex = GridPane.getColumnIndex(clickedNode);
                    Integer rowIndex = GridPane.getRowIndex(clickedNode);
                    RP.RecentMoves.setText(RP.RecentMoves.getText() + " "
                            + Math.abs(rowIndex-8) + "       " + (char)('A'+(colIndex)) + "\n");

                    List<Square> LegalMoves = Board.BoardSquares[rowIndex][colIndex].getPiece().legalMoves();
                    //Glow Legal Moves Squares
                    try {
                        for (int l = 0; l < LegalMoves.size(); l++) {
                            int legalrow = ((Square) (LegalMoves.get(l))).getRow();
                            int legalcol = ((Square) (LegalMoves.get(l))).getColoumn();
                            WhiteAndBlack[legalcol][legalrow].setFill(Color.CHARTREUSE);
                        }
                    } catch (Exception e) {
                    }
                }

            }
            );

            setOnMouseReleased((MouseEvent event) -> {
                //recolor legal moves from green to normal
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        if ((i + j) % 2 == 0) {
                            WhiteAndBlack[i][j].setFill(Color.BROWN);
                        } else {
                            WhiteAndBlack[i][j].setFill(Color.LIGHTBLUE);
                        }
                    }
                }

            }
            );

            requestFocus();
        }

    }

    class LeftPane extends GridPane {

        LeftPane() {
            //text ytktb feh ay haga, wakhed mkan 4 coloumns we 2 rows
            Label text = new Label("text");
            text.setFont(Font.font("Serif", 30));
            text.setPrefSize(200, 100);
            text.setAlignment(Pos.CENTER);

            add(text, 0, 0, 4, 2);
            // white dead left
            VBox WhitePawns = new VBox();
            WhitePawns.getChildren().add(new ImageView("Images/wp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            WhitePawns.getChildren().add(new ImageView("Images/wp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            WhitePawns.getChildren().add(new ImageView("Images/wp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            WhitePawns.getChildren().add(new ImageView("Images/wp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            VBox WhitePieces = new VBox();
            WhitePieces.getChildren().add(new ImageView("Images/wq.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            WhitePieces.getChildren().add(new ImageView("Images/wr.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            WhitePieces.getChildren().add(new ImageView("Images/wb.png"));//example DELETE DELETE DELETE JUST EXAMPLE

            add(WhitePawns, 0, 3, 1, REMAINING); // da msh hytms7
            add(WhitePieces, 1, 3, 1, REMAINING);// da msh hytms7
            // Black dead left
            VBox BlackPawns = new VBox();
            BlackPawns.getChildren().add(new ImageView("Images/bp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            BlackPawns.getChildren().add(new ImageView("Images/bp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            BlackPawns.getChildren().add(new ImageView("Images/bp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            BlackPawns.getChildren().add(new ImageView("Images/bp.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            VBox BlackPieces = new VBox();
            BlackPieces.getChildren().add(new ImageView("Images/bq.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            BlackPieces.getChildren().add(new ImageView("Images/br.png"));//example DELETE DELETE DELETE JUST EXAMPLE
            BlackPieces.getChildren().add(new ImageView("Images/bb.png"));//example DELETE DELETE DELETE JUST EXAMPLE

            add(BlackPawns, 2, 3, 1, REMAINING);// da msh hytms7
            add(BlackPieces, 3, 3, 1, REMAINING);// da msh hytms7

        }
    }

    class RightPane extends BorderPane {

        public Label RecentMoves;

        RightPane() {
            RecentMoves = new Label("Welcome\n");
            RecentMoves.setFont(Font.font("Serif", 20));
            RecentMoves.setAlignment(Pos.TOP_LEFT);

            RecentMoves.setStyle("-fx-background-color:brown;"
                    + "-fx-border-color:black;"
                    + "-fx-border-width:3;");
            RecentMoves.setPrefSize(350, 600);

            setCenter(RecentMoves);
        }

    }

    class TopPane extends HBox {

        TopPane() {

        }
    }

    class BottomPane extends HBox {
    }

}
