import studentp.Student;
import studentp.StudentServiceHandler;
import user.User;
import user.UserManager;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends UserManager {
    public static void main(String[] args) {
        StudentServiceHandler studentServiceHandler = new StudentServiceHandler();
        Scanner scanner = new Scanner(System.in);

        boolean f = true;
        while (f) {
            System.out.println("Welcome back!!! Select operation");
            System.out.println("1.Add student");
            System.out.println("2.Delete student");
            System.out.println("3.Update student information");
            System.out.println("4.Get student match by ID ");
            System.out.println("5.Show all student");
            System.out.println("6.Exit system");
            System.out.print("Enter your choice: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:

                    System.out.print("Enter UserName: ");
                    String username = scanner.next();
                    System.out.print("Enter Age: ");
                    int password = scanner.nextInt();
                    studentServiceHandler.add(new Student(studentServiceHandler.idAuto, username, password));
                    break;

                case 2:
                    System.out.print("Enter ID for delete Student: ");
                    int delID = scanner.nextInt();
                    studentServiceHandler.delete(delID);
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 3:
                    System.out.print("Enter ID for update Student information: ");
                    int updID = scanner.nextInt();
                    System.out.print("Enter new UserName: ");
                    String usernameN = scanner.next();
                    System.out.print("Enter new Age: ");
                    int age = scanner.nextInt();
                    studentServiceHandler.update(updID, usernameN,age);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 4:
                    System.out.print("Enter ID for show info Student: ");
                    int showID = scanner.nextInt();
                    studentServiceHandler.getStudent(showID);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 5:
                    System.out.println(Arrays.toString(studentServiceHandler.getAll()));
                    System.out.println("--------------------------------------------------------------");
                    break;


                case 6:
                    System.out.println("--------------------------------------------------------------");
                    f = false;
                    System.out.println("Successfuly exited");
                    break;
                default:
                    System.out.println("Input error !!!");
                    System.out.println("--------------------------------------------------------------");
            }
        }
    }
}