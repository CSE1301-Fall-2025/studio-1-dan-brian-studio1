import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter a year: ");
        year = in.nextInt();
        boolean isLeapYear;

        if (year% 4 == 0) {
            if (year% 100 == 0) {
                if (year% 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } 
            else {
                isLeapYear = true;
            }
        } 
        else {
            isLeapYear = false;
        }

        System.out.println(year + " is a leap year: " + isLeapYear);
}
}
