import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Account account = new Account(a, b, c);
        double delta = account.getDiscriminant();
        System.out.println("delta = " + delta);
        if (delta > 0) {
            System.out.printf("Vì delta>0 nên phương trình có 2 nghiệm phân biệt x1 = " + account.getRoot1() + " và x2 = " + account.getRoot2());
        } else if (delta == 0) {
            System.out.println("Vì delta = 0 nên phương trình có nghiệm duy nhất x = " + account.getRoot2());
        } else {
            System.out.println("Vì delta < 0 nên phương trình vô nghiệm!");
        }

    }
}
