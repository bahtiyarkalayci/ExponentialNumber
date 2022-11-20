import java.util.Scanner;

public class Main {
    static int exponential(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;

        }
        System.out.println("result="+result);
        return result;
    }




    public static void main(String[] args) {


        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter base number");
            int a = scanner.nextInt();
            if(a==0){
                break;
            }
            System.out.println("enter power number");
            int b = scanner.nextInt();
            exponential(a, b);
        }

    }
}