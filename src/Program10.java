import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        FindIndex fs = new FindIndex(str ,str1);
        fs.calculateIndex(str,str1);
    }
}
class FindIndex {
    private String str;
    private String str1;

    public FindIndex(String s, String str) {
        this.str = str;
        this.str1 = str1;
    }

    public void  calculateIndex(String str, String str1) {
        int  index = 0;
        for (int i = 0; i < str.length();) {
            index = str.indexOf(str1, i);
            i = index+1;
            System.out.println(index);
        }
    }
}