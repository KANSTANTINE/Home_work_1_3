import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        System.out.println("Name A: ");
        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println("Name: A " + A);

        System.out.println("Name  В: ");
        for (int i = 0; i < 5; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println("Name: B " + B);

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        for (int i = 0; i < 5 ; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("Sort С"+C);
        Collections.sort(C,new haker());
        System.out.println(C);
    }

}