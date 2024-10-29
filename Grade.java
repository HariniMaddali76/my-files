import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        int x=marks.nextInt();
        int y=marks.nextInt();
        int z=marks.nextInt();
        int k=marks.nextInt();
        int s=x+y+z+k;
        double j=s/4;
        System.out.println("Total marks of student: "+s);
        System.out.println("Average of student marks: "+j);
        if(s>200){
            System.out.println("A grade");
        }
        else if(s>=100 && s<=200){
            System.out.println("B Grade");
        }
        else if(s<100){
            System.out.println("C Gradee");
        }
    }
    }

