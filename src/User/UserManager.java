package User;

public class UserManager implements UserServices {
    User[] users = new User[100];
    int count = 0;

    @Override
    public void add(User user) {
        if (count < users.length) {
            users[count] = user;
            System.out.println("User joined !!!");
            count++;
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getID() == id) {
                users[count - 1] = null;
                count--;
                System.out.println("User deleted !!!");
                return;
            }
        }
        System.out.println("User not found !!!");
    }

    @Override
    public void get(int id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getID() == id) {
                System.out.println("ID: " + users[i].getID() + "," + "Username: " + users[i].getUsername() + "," + "Password: " + users[i].getPassword());
                return;
            }

        }

    }

    @Override
    public User[] getAll() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                count++;
            }
        }

        User[] nonNullBook = new User[count];
        int index = 0;

        for (int i = 0; i < nonNullBook.length; i++) {
            if (users[i] != null) {
                nonNullBook[index++] = users[i];
            }
        }

        return nonNullBook;
    }


    @Override
    public void update(int id, User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getID() == id) {
                users[i] = user;
                System.out.println("User information updated successfully !!!");
                return;
            }
            System.out.println("Searching ID does not match with your eneterd ID");
        }
    }
}
