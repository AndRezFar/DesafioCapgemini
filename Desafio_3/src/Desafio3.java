import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {

    static boolean araAnagram(String s1, String s2) {
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            return true;
        } else {
            return false;
        }
    }

    static int countAnagrams(String text, String word) {
        int N = text.length();
        int n = word.length();

        int res = 0;

        for (int i = 0; i <= N - n; i++) {

            String s = text.substring(i, i + n);

            if (araAnagram(word, s)){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int result = 0;

        for(int i = 2; i <= text.length(); i++) {
            String word = text.substring(0,i);
            final int countAnagrams = countAnagrams(text, word);
            if(countAnagrams > 1) {
                result++;
            }
        }

        int count = 0;
        for (char c : text.toCharArray()) {
            final int firstIndexOf = text.indexOf(c);
            final int lastIndexOf = text.lastIndexOf(c);
            if (firstIndexOf != lastIndexOf) {
                count++;
            }
        }
        result += count/2;

        System.out.println("Resultado final: " + result);

    }

}

