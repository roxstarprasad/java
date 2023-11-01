import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String color = sc.next();

        switch (color) {
            case "Red":
                System.out.println("Color is Red");
                break;
            case "Blue":
                System.out.println("Color is blue");
                break;
            case "Yellow":
                System.out.println("Color is Yellow");
                break;
            case "Orange":
                System.out.println("Color is Orange");
                break;
            default:
                System.out.println("Enter a valid color!");
                break;
        }
    }
}
