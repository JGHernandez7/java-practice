import java.io.*;

class MatrixMult 
{
	private static int n = 5;

	private static void mult(int m1[][], int m2[][], int r[][])
	{
		int i, j, k;

		for (i = 0; i < n; i++) 
    {
			for (j = 0; j < n; j++) 
      {
				r[i][j] = 0;

				for (k = 0; k < n; k++)
					r[i][j] += m1[i][k] * m2[k][j];
			}
		}
	}

	public static void main(String[] args)
	{
		int m1[][] = { 
                     { 1, 2, 3, 4, 1},
						         { 2, 2, 2, 2, 4},
						         { 3, 2, 1, 1, 3},
						         { 4, 1, 1, 4, 2},
						         { 4, 2, 3, 1, 3}, 
                    };

		int m2[][] = {
                     { 1, 2, 3, 4, 1},
						         { 2, 2, 2, 2, 4},
						         { 3, 2, 1, 1, 3},
						         { 4, 1, 1, 4, 2},
						         { 4, 2, 3, 1, 3}, 
                    };

    int i, j;
		int r[][] = new int[n][n];
		
    mult(m1, m2, r);

    System.out.println("Matrix 1: ");
    
    for (i = 0; i < n; i++) 
    {
			for (j = 0; j < n; j++)
				System.out.print(m1[i][j] + " ");
			
      System.out.println();
		}

    System.out.println("Matrix 2: ");
    
    for (i = 0; i < n; i++) 
    {
			for (j = 0; j < n; j++)
				System.out.print(m2[i][j] + " ");
			
      System.out.println();
		}

		System.out.println("Result matrix: ");
		
    for (i = 0; i < n; i++) 
    {
			for (j = 0; j < n; j++)
				System.out.print(r[i][j] + " ");
			
      System.out.println();
		}
	}
}