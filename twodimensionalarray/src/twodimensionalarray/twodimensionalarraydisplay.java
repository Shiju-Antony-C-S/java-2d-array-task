package twodimensionalarray;
import java.util.Scanner;
public class twodimensionalarraydisplay {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("");
		int row = in.nextInt();
		System.out.print("");
		int col = in.nextInt();
		int[][] arr = new int[row][col];
		  System.out.println("Enter elements of the matrix:");
	        for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                arr[i][j] = in.nextInt();
	            }
	        }
		for(int i =0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		in.close();
	}

}
