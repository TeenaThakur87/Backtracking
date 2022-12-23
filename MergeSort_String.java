public class MergeSort_String {
    
        public static String[] Mergesort(String arr[],int si,int li){
            if(si==li){
                String a[]={arr[li]};
                return a;
            }
            int mid=si + (li-si)/2;
           String str1[]= Mergesort(arr, si, mid);
           String str2[]= Mergesort(arr, mid+1, li);
          String temp[]= merge(str1,str2);  
          return temp;  
    }
    
        public static String[] merge (String str1[], String str2[]){
            int m=str1.length;
            int n=str2.length;
            String temp[]=new String[m+n];
            int i=0;
            int j=0;
            int idx=0;
            
            if(i<m && j< n){
                if(ifAlphabetcallyEqual(str1[i],str2[j])){
                    temp[idx]=str1[i];
                    idx++;
                    i++;
                }
                else{
                    temp[idx]=str2[j];
                    idx++;
                    j++;
                }
            }
            while(i<m){
                
                    temp[idx]=str1[i];
                    idx++;
                    i++;

            }

            while(j<n){
                temp[idx]=str2[j];
                    idx++;
                    j++;

            }
            return temp;
            
         }
        
         // Return true if str1 appears before str2 in alphabeticalorde
         public static boolean ifAlphabetcallyEqual(String str1, String str2){
            if(str1.compareTo(str2)<0){
                return true;
            }
            else{
                return false;
            }
         }
        public static void main(String[] args) {
            String [] arr={"fish","apples","apple","nose","morning","hello"};
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            String a[]=Mergesort(arr, 0, arr.length-1);
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            
        }
    }
    
    

