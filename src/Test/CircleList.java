import java.util.Scanner;


public class CircleList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        char a=scanner.next().charAt(0);
        StringBuilder res=new StringBuilder(s);
   for(int i=0;i<s.length();i++){
       if(s.charAt(i)-a<0){
           res.append(s.charAt(i));
       }else{
           res.append(s.charAt(a)).append(s.substring(i));
           System.out.println(res);
           return;
       }
   }
    }
}
