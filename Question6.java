package in.recursion;

public class Question6 {

	public static void solveTowerOfHanoi(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println("Move disc 1 from " + source + " to " + destination);
            return;
        }
        
        solveTowerOfHanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of discs
        String source = "A"; 
        String auxiliary = "B"; 
        String destination = "C"; 
        
        solveTowerOfHanoi(n, source, auxiliary, destination);
    }

}
