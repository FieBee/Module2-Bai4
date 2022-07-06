import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter  the wight");
        int wight = scanner.nextInt();

        System.out.println("Enter the height");
        int height = scanner.nextInt();

        Rectangle rectangle1 = new Rectangle(wight,height);
        System.out.println("Your Rectangle \n"+ rectangle1.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle1.getArea());
    }
}
