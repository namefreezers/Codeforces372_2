import java.util.Scanner;

public class Codeforces372_2A_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] s = in.nextLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int c = Integer.parseInt(s[1]);
		s = in.nextLine().split(" ");
		int j = 1;
		int prev = Integer.parseInt(s[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			int next = Integer.parseInt(s[i]);
			if (prev - next > c)
				break;
			prev = next;
			j++;
		}
		System.out.println(j);
		in.close();

	}

}
