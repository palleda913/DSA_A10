package in.recursion;

public class Question8 {

	public static int countConsonants(String S,int i) {
		if (i == S.length()) {
            return 0;
        }
		char ch=S.charAt(i);
		if(isConsonant(ch)) {
			return 1+countConsonants(S, i+1);
			
		}else
			return countConsonants(S, i+1);
		
	}

	public static boolean isConsonant(char ch) {
        return ch >= 'a' && ch <= 'z' && !"aeiou".contains(String.valueOf(ch));
    }
	
    public static void main(String[] args) {
        String S = "geeksforgeeks portal";
        System.out.println(countConsonants(S.toLowerCase(),0));
    }

}
