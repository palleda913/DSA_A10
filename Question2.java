package in.recursion;

public class Question2 {

	public static int lastRemaining(int n) {
        int start = 1;
        int end = n;
        boolean leftToRight = true;

        while (start <end) {
            if (leftToRight) {
                start += 2;
                end -= 1;
            } else {
                end -= 2;
                start += 1;
            }

            leftToRight = !leftToRight;
        }

        return end+1; 
    }

    public static void main(String[] args) {
        int n = 9;
        int result = lastRemaining(n);
        System.out.println(result);
    }

}
