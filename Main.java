public class Main {
    public static void Sort(int[]A){
        int n=A.length;
        for(int i=n-1;i>1;i--){
          for(int j=0;j<i;j++){
              if(A[j]>A[j+1]){
                  int temp=A[j];
                  A[j]=A[j+1];
                  A[j+1]=temp;
              }
          }
        }
      }
      static void printArray(int[]A){
          for(int i=0;i<A.length;i++){
              System.out.print(A[i]+" ");
          }
      }
    public static void main(String[]args){
        int[]array={5,3,8,1,2,9,15,2,0,10,7};
        System.out.print("unsorted array: ");
        printArray(array);
        System.out.println();
        System.out.print("sorted array: ");
        Sort(array);
        printArray(array);
        
       


    }
    
}
