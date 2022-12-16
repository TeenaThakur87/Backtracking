public class Keypad_Combinations {
    final static char l[][]={{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
                        {'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

public static void bfs(int pos,int len,StringBuilder sb,String num){
    if(pos==len){
        System.out.print(sb.toString()+" ");
    }
    else{
        char [] comb=l[Character.getNumericValue(num.charAt(pos))];
        for(int i=0;i<comb.length;i++){
           
            bfs(pos+1, len, new StringBuilder(sb).append(comb[i]), num);
        }
    }
}

    public static void numberComb(String num){
        int n=num.length();
        if(n==0){  
            return;
        }
        bfs(0,n,new StringBuilder(),num);
    }
    public static void main(String[] args) {
        numberComb("32");
    }
    
}
