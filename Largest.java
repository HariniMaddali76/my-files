import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner h =new Scanner(System.in);
        int a=h.nextInt();
        int b=h.nextInt();
        int c=h.nextInt();
        if(a>b && a>c){
            System.out.println("a is the largest among all: "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is the largest among all: "+b);
        }
        else{
            System.out.println("c is the largest among all ");
        }

    }
    }
