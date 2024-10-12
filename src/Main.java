import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("введите трёх значное число:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer s = new StringBuffer(String.valueOf(n));
        String a = String.valueOf(s.charAt(0));
        String b = String.valueOf(s.charAt(1));
        String c = String.valueOf(s.charAt(2));
        String d = String.valueOf(s.charAt(3));

        int da = Integer.parseInt (a);
        int db = Integer.parseInt (b);
        int dc = Integer.parseInt (c);
        int dd = Integer.parseInt (d);
        System.out.printf("а) %1$d \n", da+db+dc+dd);
        System.out.printf("б) %1$d \n", da*db*dc*dd);

    }
}