import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		System.out.println(modernArt());
		
	}
	
	public static int modernArt() {
		Scanner inputObj = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		int m = inputObj.nextInt();
		int n = inputObj.nextInt();
		int k = inputObj.nextInt();
		String[][] arr = new String[m][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "B";
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for (int x = 0; x < k; x++) {
			String inp = scan.nextLine();
			String side = inp.substring(0, 1);
			String num = inp.substring(2);
			
			if(side.equals("R")) {
				for(int y = 0; y < n; y++) {
					if (arr[Integer.parseInt(num) - 1][y] =="B")
						arr[Integer.parseInt(num) - 1][y] = "G";
					else
						arr[Integer.parseInt(num) - 1][y] = "B";
				}
			}
			else if(side.equals("C")) {
				for(int y = 0; y < m; y++) {
					if (arr[y][Integer.parseInt(num) - 1] =="B")
						arr[y][Integer.parseInt(num) - 1] = "G";
					else
						arr[y][Integer.parseInt(num) - 1] = "B";
				}
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		int total = 0;
		for(String[] a: arr) {
			for(String b: a) {
				if(b.equals("G")){
					total++;
				}
			}
		}
		
		return(total);
	}
	
}
