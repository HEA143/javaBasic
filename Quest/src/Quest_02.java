
public class Quest_02 {
	public static void main(String[] args) {
		final int N = Integer.parseInt(args[0]);
		for(int j = 1; j <= N; j++) {
			if( j % 3 == 0) {
				System.out.println(j);
			}
		}
	}
}