import java.util.*;
class MazeSolve{
    static void ms(int row,int col,int n,int maze[][],boolean vis[][],String path,List<String> paths) {
       if(row==n-1 && col==n-1) {
        paths.add(path);
        return;
       }
       //choose directions
       vis[row][col]=true;
       //down
       if(row+1<n&&maze[row+1][col]==1&&!vis[row+1][col]) {
        ms(row+1,col,n,maze,vis,path+"D",paths);
       }
       //left
       if(col-1>=0&&maze[row][col-1]==1&&!vis[row][col-1]) {
        ms(row,col-1,n,maze,vis,path+"L",paths);
       }
       //right
       if(col+1<n&&maze[row][col+1]==1&&!vis[row][col+1]) {
        ms(row,col+1,n,maze,vis,path+"R",paths);
       }
       //up
       if(row-1>=0&&maze[row-1][col]==1&&!vis[row-1][col]) {
        ms(row-1,col,n,maze,vis,path+"U",paths);
       }    
       vis[row][col]=false;
    }
    
    public static void main(String[] args) {
        List<String> paths = new ArrayList<>();
        int[][] maze = {
            {1,0,1,1,1},
            {1,1,1,0,1},
            {1,1,0,1,1},
            {0,1,1,0,1},          
            {1,1,1,1,1}
        };
        int n=5;
        boolean vis[][] = new boolean[n][n];
        ms(0,0,n,maze,vis,"",paths);
        System.out.println(paths);
    }
}
