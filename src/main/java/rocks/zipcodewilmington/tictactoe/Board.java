package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    String outcome = "";
    public Board(Character[][] matrix) {
        if (matrix[0][1].equals(matrix[0][0]) && (matrix[0][1].equals(matrix[0][2])) && !matrix[0][1].equals(' '))
        {
            outcome +=  matrix[0][1];    //top row
        }else if (matrix[1][0].equals(matrix[1][1]) && (matrix[1][1].equals(matrix[1][2]))&& !matrix[1][1].equals(' '))
        {
            outcome +=  matrix[1][0];    //middle row
        }else if (matrix[2][1].equals(matrix[2][0]) && (matrix[2][1].equals(matrix[2][2]))&& !matrix[2][2].equals(' '))
        {
            outcome +=  matrix[2][1];   //bottom row
        }else if (matrix[0][2].equals(matrix[1][1]) && (matrix[0][2].equals(matrix[2][0]))&& !matrix[0][2].equals(' '))
        {
            outcome +=  matrix[0][2];   //top right to bottom left
        }else if (matrix[0][1].equals(matrix[1][1]) && (matrix[0][1].equals(matrix[2][1]))&& !matrix[0][1].equals(' '))
        {
            outcome +=  matrix[0][1];   //middle column
        }else{if (matrix[1][2].equals(matrix[0][2]) && (matrix[1][2].equals(matrix[2][2]))&& !matrix[1][2].equals(' '))
        {
            outcome +=  matrix[1][2];   //third column
        }else if (matrix[0][0].equals(matrix[1][1]) && (matrix[0][0].equals(matrix[2][2]))&& !matrix[0][0].equals(' '))
        {
            outcome +=  matrix[0][0];   //top left to bottom right
        }else if (matrix[0][0].equals(matrix[1][0]) && (matrix[0][0].equals(matrix[2][0]))&& !matrix[0][0].equals(' '))
        {
            outcome +=  matrix[0][0];  //first column

        }else{outcome += "";
        }
        }
    }


    public Boolean isInFavorOfX() {
        if (outcome.equals("X")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isInFavorOfO() {
        if (outcome.equals("O")) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {
        if (outcome.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public String getWinner() {

        return outcome;
    }

}