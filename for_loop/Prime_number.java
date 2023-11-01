import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num%i==0){
                count++;
                break;
            }
        }

        if(count == 0)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a prime number!");
    }
}
