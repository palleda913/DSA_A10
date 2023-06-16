package in.recursion;

public class Question4 {

	 public static int calculateLength(String s) {
		 if(s.equals(" ")|| s.isEmpty()){
			 return 0;
		 }
		 return 1+calculateLength(s.substring(1));
	 }
	 public static void main(String[] args) {
		System.out.println(calculateLength("geeksforgeeks"));
	 }

}
