import java.util.Scanner;
public class Equal{
    public static void main(String[]args){
        Scanner h=new Scanner(System.in);
        int a=h.nextInt();
        int b=h.nextInt();
        if(a==b){
            System.out.println("They are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}