import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int start = 0;
        int current = 1;
        int count = 2;
        
        System.out.print("0" + " "+ "1"+" ");
        while(count < n){
            int temp = current;
            current = current + start;
            start = temp;
            System.out.print(current + " ");
            count++;
        }
    }
}