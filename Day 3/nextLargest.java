class nextLargest{
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1};
        int [] res=new int[arr.length];
        //res=arr.clone();
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                res[i]=arr[j];
                flag=true ;
                break;
                }
               if(flag==false ){
                res[i]=-1;
               }
        }

    }
    for(int i=0;i<res.length;i++){       
          if(res[i]==0){
            res[i]=-1;
          }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("  ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
}
    }