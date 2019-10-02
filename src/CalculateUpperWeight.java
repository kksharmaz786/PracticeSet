import java.util.Scanner;

public class CalculateUpperWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Execution2 ec = new Execution2(str);
        int  str1= ec.upperWeight(str);
        System.out.println(str1);
    }
}
class Execution2 {
    private  String str;

    public Execution2(String str) {
        this.str = str;
    }

    public int upperWeight(String str) {
        int str1 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + 0 > 64 && str.charAt(i) + 0 < 91) {
                str1 = str1 + (str.charAt(i) + 0);
            }
        }
        return str1;
    }
}
