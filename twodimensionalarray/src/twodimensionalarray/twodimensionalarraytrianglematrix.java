package twodimensionalarray;
import java.util.Scanner;

public class twodimensionalarraytrianglematrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        boolean right = true; 
        boolean left = true;  

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != 0) {
                    right = false;
                }
            }
        }

       
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) { 
                if (arr[i][j] != 0) {
                    left = false;
                }
            }
        }

        if (right) {
            System.out.println("Right angled matrix");
        } else if (left) {
            System.out.println("Left angled matrix");
        } else {
            System.out.println("No angled matrix");
        }

        in.close();
    }
}
