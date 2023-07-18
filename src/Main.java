import java.util.Scanner;

 class SetBit {
    static int setBit(int A, int B){
        int result = 0;
        if(A==B){
            result=(int)Math.pow(2,A);
        }
        else{
            result+=Math.pow(2,A);
            result+=Math.pow(2,B);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(setBit(A, B));
    }
}