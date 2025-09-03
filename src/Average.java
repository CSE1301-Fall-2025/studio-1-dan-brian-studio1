import java.util.Scanner;
public class Average {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two integers:");
    int a = in.nextInt();
    int b = in.nextInt(); 
    double avg = (a + b) / 2.0;
    System.out.println("The average of " + a + " and " + b + " is " + avg);
}
}
