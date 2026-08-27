package twodimensionalarray;

import java.util.Scanner;
public class twodimensionalarrayaddition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no of row");
		int row = in.nextInt();
		System.out.println("Enter no of col");
		int col = in.nextInt();
		int[][] arr = new int[row][col];
		int[][] arr1 = new int[row][col];
		  System.out.println("Enter elements of the matrix1:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                arr[i][j] = in.nextInt();
	            }
	        }
	        System.out.println("Enter elements of the matrix2:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                arr1[i][j] = in.nextInt();
	            }
	        }
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				arr[i][j]=arr[i][j]+arr1[i][j];
				System.out.println(arr[i][j]);
			}
			
		}
		in.close();
	}

}
