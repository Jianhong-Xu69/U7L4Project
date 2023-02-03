import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeInterview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, d, q;
        String current;
        String unSeparatedList;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        current = input.nextLine();
        n = Integer.parseInt(current);
        for (int i = 0; i < n; i++) {
            current = input.nextLine();
            temp.add(Integer.parseInt(current.substring(0, current.indexOf(" "))));
        }
    }
}
