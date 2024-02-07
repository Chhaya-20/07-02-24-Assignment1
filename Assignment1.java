
//import java.lang.reflect.Array;
import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Strings ");
        int n = sc.nextInt();
        String[] a = new String[n];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            a[i] = str;

        }

        Map<String, List<String>> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c[] = a[i].toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);

            if (!m.containsKey(sortedWord)) {
                m.put(sortedWord, new ArrayList<>());
            }
            m.get(sortedWord).add(a[i]);

        }
        System.out.println("Group Anagrams are ");
        for (List<String> i : m.values()) {
            for (String s : i) {
                System.err.print(s + " ");
            }
            System.out.println();

        }

        // System.out.println(m);
        sc.close();

    }
}