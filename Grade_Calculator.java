import java.util.Scanner;
public class Grade_Calculator {
    public static String grade_cal(float avg){
        if (avg>=50 && avg<60) {
           return "E grade";
        } else if (avg>=60 && avg<70) {
            return "D grade";
        } else if (avg>=70 && avg<80) {
            return "C grade";
        } else if (avg>=80 && avg<90) {
            return "B grade";
        } else if (avg >= 90) {
            return "A grade";
        } else {
            return "F grade";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks out of 100");
        System.out.println("Enter the marks in Social");
        float sub1=sc.nextFloat();
        System.out.println("Enter the marks in Mathematics");
        float sub2=sc.nextFloat();
        System.out.println("Enter the marks in English");
        float sub3=sc.nextFloat();
        System.out.println("Enter the marks in Hindi");
        float sub4=sc.nextFloat();
        System.out.println("Enter the marks in Science");
        float sub5=sc.nextFloat();
        System.out.println("Enter the marks in Telugu");
        float sub6=sc.nextFloat();
        float total_marks=sub1+sub2+sub3+sub4+sub5+sub6;
        float average=total_marks/6;
        System.out.printf("Your total marks are %.2f out of 600 \naverage percentage  is %.2f%%",total_marks,average);
        System.out.printf("\nYou got %s",grade_cal(average));
    }
}
