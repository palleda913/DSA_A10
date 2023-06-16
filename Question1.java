package in.recursion;

public class Question1 {

	 public static boolean isPowerOfFour(int n) {
	        if(n<=0)
	            return false;
	        if(n==1)
	            return true; 
	        if(n%3==0)
	            return  isPowerOfFour(n/3);
	        else
	            return false;
	 }
	public static void main(String[] args) {
		int n=27;
	
		System.out.println(isPowerOfFour(n));
	}

}
