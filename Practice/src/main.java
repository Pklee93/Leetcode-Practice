
public class main {
	public static void main(String[] args) {
		int a = 3;
		int y = 4;
		boolean[][] mat = new boolean[3][4];
		for (int x = 0; x < mat.length; x++) {
			for (int y = 0; y < mat[x].length; y++) {
				System.out.print(mat[x][y]);
			}
			System.out.println("\n");
		}
	}
}
