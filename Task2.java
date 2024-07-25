import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        System.out.println("Enter marks obtained in Engish");
        double eng = sc.nextDouble();
        System.out.println("Enter marks obtained in Maths");
        double maths = sc.nextDouble();
        System.out.println("Enter marks obtained in Physics");
        double phy = sc.nextDouble();
        System.out.println("Enter marks obtained in chem");
        double chem = sc.nextDouble();
        System.out.println("Enter marks obtained in PE");
        double pe = sc.nextDouble();
        double total_marks = eng+maths+phy+chem+pe ;
        double avg_per = total_marks/5;
        // printing
        System.out.println(name);
        System.out.println("Total marks : " + (total_marks));
        System.out.println("Average Percentage : " + (avg_per));
        if (100>avg_per && avg_per>90) {
            System.out.println("Grade = O");
            }
        else if (90 >avg_per && avg_per> 80) {
            System.out.println("Grade = A+");
        }
        else if ( 80 >= avg_per && avg_per > 70) {
            System.out.println("Grade = A");
        }
        else if ( 70 >= avg_per && avg_per > 60) {
            System.out.println("Grade = B+");
        }
        else if ( 60 >= avg_per && avg_per > 50) {
            System.out.println("Grade = B");
        }
        else if ( 50 >= avg_per && avg_per > 45) {
            System.out.println("Grade = P");
        }
        else if (avg_per < 45){
            System.out.println("Grade = Failed ");
        }

    }

    
}
