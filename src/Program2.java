import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endIndex;
        int startIndex;
        String str = sc.nextLine();
        startIndex = sc.nextInt();
        endIndex = sc.nextInt();
        ExecutionClass ec = new ExecutionClass(str, startIndex, endIndex);
        ec.subString(str, startIndex, endIndex);
    }
}
    class ExecutionClass{
        private  String str;
        private  int startIndex;
        private  int endIndex;
      public ExecutionClass(String str,int startIndex,int endIndex){
          this.endIndex = endIndex;
          this.startIndex = startIndex;
          this.str = str;
        }

        public void subString(String str,int startIndex,int endIndex){
          System.out.println(str.substring(startIndex,endIndex));
        }
    }
