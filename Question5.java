package in.recursion;

public class Question5 {

	public static int countSubstrings(String S) {
        int count = 0;
        int n = S.length();

        for (int i = 0; i < n; i++) {
            count++;
            int j = i + 1;

            while (j < n && S.charAt(i) == S.charAt(j)) {
                count++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String S = "abccba";
        System.out.println(countSubstrings(S));
    }

}
