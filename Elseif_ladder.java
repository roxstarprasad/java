import java.util.Scanner;

public class Elseif_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=16 && age<=18)
            System.out.println("Eligible for vote");
        else if(age<=15 || age>18)
            System.out.println("Not Eligible for vote");
    }
}
