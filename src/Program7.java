import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Execution1 ec = new Execution1(str);
        int  ascii= ec.asciiCount(str);
        System.out.println(ascii);
    }
}
class Execution1{
    private String str;

    public Execution1(String str) {
        this.str = str;
    }
    public int asciiCount(String str){
        int  ascii = 0;
        for (int i = 0;i<str.length();i++){
         ascii = ascii + str.charAt(i);
        }
        return ascii;
    }
}
