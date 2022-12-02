
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scan.nextLine());
        String grade = "";
        if (point > 100) {
            grade = "incredible";
        } else if (point >= 90 && point <= 100) {
            grade = "5";
        } else if (point >= 80 && point <= 89) {
            grade = "4";
        } else if (point >= 70 && point <= 79) {
            grade = "3";   
        } else if (point >= 60 && point <= 69) {
            grade = "2";         
        } else if (point >= 50 && point <= 59) {
            grade = "1";              
        } else if (point >= 0 && point <= 49) {
            grade = "failed";
        } else {
            grade = "impossible!";
        }
        System.out.println("Grade: " + grade);
    }
}
