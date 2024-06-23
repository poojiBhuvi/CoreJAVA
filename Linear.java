import java.util.Scanner;


/*
class Linear{
    public static int Lsearch(int arr[],int key){
        int N = arr.length;
        for(int i=0;i<N;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = in.nextInt();
        int arr[] = new int[10];
        for(int j=0;j<n;j++){
            arr[j] = in.nextInt();
        }
        int key = in.nextInt();
        int result = Lsearch(arr,key);
        if(result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+ result);
    }
}
*/

class Linear{
    public static int Lsearch(int array[],int N,int key){
        if(N==0)
            return -1;
        else if(N-1==key)
                return N-1;
        else
            return Lsearch(array,N-1,key);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[10];
        for(int j=0;j<n;j++){
            array[j] = in.nextInt();
        }
        int key = in.nextInt();
        int N = array.length;
        int result = Lsearch(array,N,key);
        if(result==-1)
            System.out.println("NotFound");
        else
            System.out.println("Element found at "+ result);
    }
}