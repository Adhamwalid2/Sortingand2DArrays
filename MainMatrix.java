public class MainMatrix {
    public static void main(String[] args) {
    int[][]A={{1,2},
              {3,4},
              {5,6}};
    int[][]B={{7,8,9,10},
              {11,12,13,14},
              {15,16,17,18},
              {19,20,21,22}};
    int[][]C={{2,4,8,0},
              {5,2,8,1}};
    Matrix.printMatrix(A);
    System.out.println();
    int[][] transposedA =Matrix.transpose(A);
    Matrix.printMatrix(transposedA);
    System.out.println();
    int[][]AxB=Matrix.mult(A,B);
    Matrix.printMatrix(AxB);
    System.out.println();
    int[][]AxC=Matrix.mult(A,C);
    Matrix.printMatrix(AxC);
    System.out.println();
    Matrix.printMatrix(Matrix.mult(B,C));
    System.out.println();
    Matrix.printMatrix(Matrix.mult(C,B));




    }
    
}
