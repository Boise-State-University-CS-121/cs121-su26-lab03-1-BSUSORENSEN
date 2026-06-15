import java.util.Scanner;

public class SphereCalculator {
    public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    int radius;
    double volume;
    double area;
    
    System.out.print("Enter the sphere's radius: ");
    radius = scnr.nextInt();

    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3);
    area = 4.0 * Math.PI * Math.pow(radius,2);

    System.out.printf("Volume: %.4f\n", volume);
    System.out.printf("Surface area: %.4f\n", area);

    scnr.close();
    }
}
