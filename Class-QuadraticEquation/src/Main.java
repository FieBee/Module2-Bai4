import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a");
        double a = scanner.nextDouble();
        System.out.println("Nhap b");
        double b = scanner.nextDouble();
        System.out.println("Nhap c");
        double c = scanner.nextDouble();


        QuadraticEquation test1 = new QuadraticEquation();
        test1.setA(a);
        test1.setB(b);
        test1.setC(c);

        System.out.println("Delta cua PT la: " + test1.getDiscriminant());
        System.out.println("Pt co nghiem 1: "+ test1.getRoot1());
        System.out.println("Pt co nghiem 2: "+ test1.getRoot2());
    }
}
