import java.util.Scanner;

public class Codeforces372_2B_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		// StringBuilder sb = new StringBuilder(s.substring(0, 26));
		int[] map = new int[26];
		for (int i = 0; i < 26; i++)
			map[i] = 0;
		int k = 0;
		int l = 0;
		int i = 0;
		while (i < 26) {
			if (s.charAt(i) == '?') {
				l++;
				i++;
				continue;
			}
			int prev = map[s.charAt(i) - 'A']++;
			if (prev == 0)
				k++;
			i++;
		}
		while (k + l != 26 && i < s.length()) {
			if (s.charAt(i - 26) == '?')
				l--;
			else if (map[s.charAt(i - 26) - 'A']-- == 1)
				k--;
			if (s.charAt(i) == '?') {
				l++;
				i++;
				continue;
			} else {
				if (map[s.charAt(i) - 'A']++ == 0)
					k++;
				i++;
			}
		}
		if (k+l != 26){
			System.out.println(-1);
			return;
		}
		StringBuilder sb = new StringBuilder(s);
		int ind = 0;
		for (int j = i - 26; j < i; j++)
			if (sb.charAt(j) == '?') {
				while (map[ind] > 0)
					ind++;
				sb.setCharAt(j, (char) ('A' + ind));
				ind++;
			}
		for (int i1 = 0; i1<sb.length(); i1++)
			if (sb.charAt(i1) == '?')
				sb.setCharAt(i1, 'A');
		System.out.println(sb);
		
	}

}
