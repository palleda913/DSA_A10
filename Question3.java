package in.recursion;

public class Question3 {

	 public static void printAllSubsets(String set) {
	        printAllSubsetsHelper(set, "", 0);
	    }

	    private static void printAllSubsetsHelper(String set, String subset, int index) {
	        if (index == set.length()) {
	            System.out.println(subset);
	            return;
	        }

	        printAllSubsetsHelper(set, subset, index + 1);

	        printAllSubsetsHelper(set, subset + set.charAt(index), index + 1);
	    }

	    public static void main(String[] args) {
	        String set = "abc";
	        printAllSubsets(set);
	    }
}
