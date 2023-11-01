import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = String.valueOf(num).length();
        int temp = num;
        int res = 0;

        while(num>0){
            int last = num%10;
            res = (int)Math.pow(last, count) + res;
            num /= 10;
        }

        if(temp == res)
            System.out.println(temp + "is an Armstrong number!");
        else
            System.out.println(temp + "is not an Armstrong number.");
    }
}
