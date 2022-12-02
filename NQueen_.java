public class NQueen_ {
    //to find the possible cases
    public static boolean IfPlace(char board[][],int row,int col){
        //for above
        for(int i=row-1;i>=0;i--){

            if(board[i][col]=='Q'){
                return false;
            }
    }
        //for left diagonal
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //for right diagonal
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    //to place the queen (if possible)
    public static void PlaceQueen(char board[][],int row){
        if(row==board.length){
            printboard(board);
            return;
        }       
                for(int j=0;j<board.length;j++){
                    if(IfPlace(board, row, j)){
                    board[row][j]='Q';
                    PlaceQueen(board, row+1);
                    board[row][j]='.';
                }
         }
    }
    // to print the possibles cases
    public static void printboard(char board[][]){
        System.out.println("_________________");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];
        //initialize board with "."
        for(int i=0;i<board.length;i++){
             for(int j=0;j<board.length;j++){
                 board[i][j]='.';
             }
         }
         PlaceQueen(board, 0);
    }
    
}
