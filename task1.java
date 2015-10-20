package task1;
// Матрица, рисующая крест, заполняя остальное нулями
public class CuteMatrix {
	public static void main(String[] args) {
		int A[][]=new int[10][10];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (i==j || i==9-j || j==9-i) 
					A[i][j]=1;
				else 
					A[i][j]=0;
				System.out.print(A[i][j]+"  ");									
			}
			System.out.println();
		}
						
		
	}
}
