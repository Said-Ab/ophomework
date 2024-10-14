import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle=new Triangle();
        triangle.a= scanner.nextInt();
        triangle.b= scanner.nextInt();
        triangle.c= scanner.nextInt();
        triangle.area(triangle.a, triangle.b, triangle.c);
    }
}