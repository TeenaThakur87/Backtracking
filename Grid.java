public class Grid {
    //to find the total way to reach on m,n from i,j 
    public static int gridcount(int i,int j,int m, int n){
        if(i==n-1&&j==m-1){
            return 1;
        }
         else if(i==n||j==m){
             return 0;
         }

        int w1=gridcount(i+1, j, m, n);
        int w2=gridcount(i, j+1, m, n);
        //total ways
        return w1+w2;
    }
    public static void main(String[] args) {
        System.out.println(gridcount(0, 0, 3, 3));
    }
    
}
