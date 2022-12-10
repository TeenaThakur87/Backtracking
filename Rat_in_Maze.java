public class Rat_in_Maze {
    public static void  RatDestination(int maze[][],int initial_maze[][],int i,int j,int k,int l){
        
        if(i==maze[0].length||j==maze[1].length){
            return;
        }
        if(maze[i][j]!=0){
        initial_maze[i][j]=1;
        if(i==k&&j==l){

        
            print(initial_maze);
            return;
        }
        System.out.println();
        RatDestination(maze, initial_maze, i, j+1, k, l);
        RatDestination(maze, initial_maze, i+1, j, k, l);
        
    }
        }
        static void print(int initial_maze[][]){
            for(int i=0;i<initial_maze.length;i++){
                for(int j=0;j<initial_maze.length;j++){
                    System.out.print(initial_maze[i][j]+" ");
                }
                System.out.println();
            }
        }
       public static void main(String[] args) {
        int maze[][]={ { 1, 0, 0, 0 },
                     { 1,0, 0, 0 },
                     { 1, 0, 0, 0 },
                     { 1, 1, 1, 1 } };
        int initial_maze[][]={{0,0,0,0,},
                            {0,0,0,0,}, 
                            {0,0,0,0,},
                            {0,0,0,0,},  };
            RatDestination(maze, initial_maze, 0, 0,3,3);
    }
    
}
