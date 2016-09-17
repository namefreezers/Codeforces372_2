import java.util.Scanner;

public class Codeforces372_2C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		in.close();
		int[] arr = new int[n];
		// int sch = 0;
		long i = 1;
		long j = 2;
		long sqrt = 2;
		long j0 = j;
		while (i <= n) {
			j = sqrt * sqrt;
			while ((j - j0) % i != 0) {
				sqrt += (i + 1);
				j = sqrt * sqrt;
			}
			/*
			 * while (sqrt*sqrt!=j || sqrt%(i+1) != 0){ j+=i; sch++; while (j>=
			 * (sqrt+1)*(sqrt+1)) sqrt++; }
			 */
			arr[(int) (i - 1)] = (int) ((j - j0) / i);
			i++;
			j0 = sqrt;
			sqrt = (int) Math.ceil(Math.sqrt(sqrt));
			if (sqrt % (i + 1) != 0) {
				sqrt -= sqrt % (i + 1);
				sqrt += (i + 1);
			}
			j = sqrt * sqrt;
			/*
			 * arr[(int) (i-1)] = sch; sch = 0; i++; j=sqrt; sqrt =
			 * (int)Math.sqrt(sqrt);
			 */
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

}
