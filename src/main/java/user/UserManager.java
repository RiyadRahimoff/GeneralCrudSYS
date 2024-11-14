package user;

public class UserManager implements UserServices {
    User[] users = new User[20];
    int count = 0;
    public int idAuto = 1;

    @Override
    public void add(User user) {
        if (count < users.length) {
            users[count] = user;
            System.out.println("User joined !!!");
            count++;
            System.out.println("Each user has own unique ID. Don't forget ID");
            System.out.println("Your id: " + idAuto);
            System.out.println("--------------------------------------------------------------");
            idAuto++;
        } else {
            System.out.println("Data is full !!!");
            System.out.println("--------------------------------------------------------------");
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                users[--count] = null;
                System.out.println("User deleted !!!");
                return;
            }
        }
        System.out.println("User not found !!!");
    }

    @Override
    public void update(int id, User user) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                users[i].setId(id);
                users[i].setPassword(user.getPassword());
                users[i].setUsername(user.getUsername());
                System.out.println("Updated successfully !!!");
            }
        }
    }

    @Override
    public void get(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                System.out.println("ID: " + users[i].getId() + "," + "Username: "
                        + users[i].getUsername() + "," + "Password: " + users[i].getPassword());
                return;
            }

        }

    }

    @Override
    public void login(int id, int pass) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id & users[i].getPassword() == pass) {
                System.out.println("Welcome " + users[i].getUsername());
                break;
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
        User[] users1 = new User[count];
        int index = 0;
        for (int i = 0; i < users1.length; i++) {
            if (users[i] != null) {
                users1[index++] = users[i];
            }
        }
        return users1;
    }

}