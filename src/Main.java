import User.User;
import User.UserManager;
import java.util.Arrays;
import java.util.Scanner;

public class Main extends UserManager {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);

        boolean f = true;
        while (f) {
            System.out.println("Welcome back!!! Select operation");
            System.out.println("1.Add user");
            System.out.println("2.Delete user");
            System.out.println("3.Update user information");
            System.out.println("4.Get user match by ID ");
            System.out.println("5.Show all users");
            System.out.println("6.Login");
            System.out.println("7.Exit system");
            System.out.print("Enter your choice: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:

                    System.out.print("Enter UserName: ");
                    String username = scanner.next();
                    System.out.print("Enter Password: ");
                    int password = scanner.nextInt();
                    userManager.add(new User(userManager.idAuto, username, password));
                    break;

                case 2:
                    System.out.print("Enter ID for delete User: ");
                    int delID = scanner.nextInt();
                    userManager.delete(delID);
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 3:
                    System.out.print("Enter ID for update User information: ");
                    int updID = scanner.nextInt();
                    System.out.print("Enter new UserName: ");
                    String usernameN = scanner.next();
                    System.out.print("Enter new Password: ");
                    int passwordN = scanner.nextInt();
                    userManager.update(updID, new User(updID, usernameN, passwordN));
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 4:
                    System.out.print("Enter ID for show info User: ");
                    int showID = scanner.nextInt();
                    userManager.get(showID);
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 5:
                    System.out.println(Arrays.toString(userManager.getAll()));
                    System.out.println("--------------------------------------------------------------");
                    break;

                case 6:
                    System.out.print("Enter ID: ");
                    int loginID = scanner.nextInt();
                    System.out.print("Enter Password: ");
                    int loginPass = scanner.nextInt();
                    userManager.login(loginID, loginPass);
                    System.out.println("--------------------------------------------------------------");
                    break;
                case 7:
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
