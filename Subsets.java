class Subsets{
    public static void subset(String str,int index,String ans){
        if(index==str.length()){
            System.out.println(ans);
           return;
     }
        //choice
        subset(str, index+1, ans+str.charAt(index));
        //not choice
        subset(str, index+1, ans);
        
    }
    public static void main(String[] args) {
        String str="abcd";
        subset(str, 0, "");
    }
}