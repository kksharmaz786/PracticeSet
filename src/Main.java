import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Resorce rs = new Resorce(str);
        rs.StrFormat(str);

    }
}
class Resorce {
    private String str;

    public Resorce(String str) {
        this.str = str;
    }

    public void StrFormat(String  str) {
        System.out.print("index :");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        System.out.print("char  :" );
        for (int i = 0; i < str.length(); i++) {
            System.out.print(" "+str.charAt(i)+ " ");

        }
    }
}