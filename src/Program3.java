import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Execution ec = new Execution(str);
       String  str1= ec.replace(str);
        System.out.println(str1);
    }
}
     class Execution{
         private String str;

        public Execution(String str) {
            this.str = str;
        }
    public String replace(String str){
            str=str.toLowerCase();
        str = str.replace('a','*');
        str = str.replace('e','*');
        str = str.replace('i','*');
        str = str.replace('o','*');
        str = str.replace('u','*');
        return str;
        }
    }

