public class Quick_Sort {

    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void QuickSort(int arr[],int si,int li){
        if(si>=li){
            return;
        }
        int pindx=Partition( arr, si, li);
        QuickSort(arr, si, pindx-1);//left
        QuickSort(arr, pindx+1, li);//right
    }

    public static int Partition(int arr[], int si, int li ){
        int pivot=arr[li];
        int i=si-1;//to make place for els less than pivot
        for(int j=si;j<li;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[li]=arr[i];
        arr[i]=pivot;
        return i;
        
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,7,2,4,-9,-5};
        QuickSort(arr, 0, arr.length-1);
        printarr(arr);
        
    }
    
}
