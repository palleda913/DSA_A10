package in.recursion;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        generatePermutations(str.toCharArray(), 0, permutations);
        return permutations;
    }

    private static void generatePermutations(char[] chars, int index, List<String> permutations) {
        if (index == chars.length - 1) {
            permutations.add(new String(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            generatePermutations(chars, index + 1, permutations);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str = "abb";
        List<String> permutations = getPermutations(str);
        for (String permutation : permutations) {
            System.out.print(permutation+" ");
        }
    }

}
