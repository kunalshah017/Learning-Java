import java.util.Scanner;

public class ExamMarks {
    static int m1, m2, m3, m4, m5;
    static String name;
    static float percentage;

    public static void getName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scan.nextLine();
    }

    public static void getMarks() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your marks of subject 1: ");
        m1 = scan.nextInt();
        System.out.print("Enter your marks of subject 2: ");
        m2 = scan.nextInt();
        System.out.print("Enter your marks of subject 3: ");
        m3 = scan.nextInt();
        System.out.print("Enter your marks of subject 4: ");
        m4 = scan.nextInt();
        System.out.print("Enter your marks of subject 5: ");
        m5 = scan.nextInt();
    }


    public static void display() {
        System.out.println("Name: " + name);
        System.out.println("Total marks: " + (m1 + m2 + m3 + m4 + m5));

        percentage = (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.printf("Percentage: %.2f", percentage);
    }
}