public class Matrix {

    public static int[][]transpose(int[][]matrix){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[][]transMatrix=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transMatrix[j][i]=matrix[i][j];
            }
        }
        return transMatrix;
    }
    public static int[][]mult(int[][]matrixA,int[][]matrixB){
    if(matrixA[0].length==matrixB.length){
          
        int rows=matrixA.length;
        int cols=matrixB[0].length;
        int n=matrixA[0].length;
        int[][]Result=new int[rows][cols];   
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                for(int k=0;k<n;k++){
                  Result[i][j]=Result[i][j] + (matrixA[i][k]*matrixB[k][j]);
                }
            }
        }
        return Result;
        }else{
        System.out.println("Die Anzahl der Spalten der ersten Matrix muss gleich die Anzahl der Zeilen in der 2. Matrix entsprechen");
    int[][] matrixFalsch = new int[0][0];
    return matrixFalsch;
}
}
    
    static void printMatrix(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
             }
             System.out.println();
        }
    }
    
    
}
