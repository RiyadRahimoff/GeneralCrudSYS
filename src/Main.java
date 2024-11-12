import User.User;
import User.UserManager;
import jdk.jshell.spi.ExecutionControl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome back!!! Select operation");
            System.out.println("1.Add user");
            System.out.println("2.Delete user");
            System.out.println("3.Update user information");
            System.out.println("4.Get user match by ID ");
            System.out.println("5.Show all users");
            System.out.println("6.Exit system");
            System.out.print("Enter your choice: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Enter ID: ");
                    int ID = scanner.nextInt();
                    System.out.print("Enter UserName: ");
                    String username = scanner.next();
                    System.out.print("Enter Password: ");
                    int password = scanner.nextInt();
                    userManager.add(new User(ID,username,password));
                    break;

                case 2:
                    System.out.print("Enter ID for delete User: ");
                    int delID = scanner.nextInt();
                    userManager.delete(delID);
                    break;
                case 3:
                    System.out.print("Enter ID for update User information: ");
                    int updID = scanner.nextInt();
                    System.out.print("Enter new ID: ");
                    int IDN = scanner.nextInt();
                    System.out.print("Enter new UserName: ");
                    String usernameN = scanner.next();
                    System.out.print("Enter new Password: ");
                    int passwordN = scanner.nextInt();
                    userManager.update(updID,new User(IDN,usernameN,passwordN));
                    break;

                case 4:
                    System.out.print("Enter ID for show info User: ");
                    int showID = scanner.nextInt();
                    userManager.get(showID);
                    break;

                case 5:
                    System.out.println(Arrays.toString(userManager.getAll()));
                    break;

                default:
                    System.out.println("Input error !!!");
            }
        }
    }
}
