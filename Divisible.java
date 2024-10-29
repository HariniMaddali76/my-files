import java.util.Scanner;
public class Divisible{
    public static void main(String[] args){
        Scanner h =new Scanner(System.in);
        int x=h.nextInt();
        if(x%5==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("No");
        }
    }
}