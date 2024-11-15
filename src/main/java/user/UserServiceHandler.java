package user;

public class UserServiceHandler implements UserServices {
    User[] users = new User[20];
    int count = 0;
    public int idAuto = 1;

    @Override
    public void add(String name, int age) {
        if (count < users.length) {
            users[count] = new User(idAuto, name, age);
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
        boolean deleted = false;
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                users[--count] = null;
                System.out.println("User deleted !!!");
                deleted = true;
                return;
            }
        }
        if (!deleted) {
            System.out.println("Matching ID not found !!!");
        }
    }

    @Override
    public void update(int id, String name, int pass) {
        boolean updated = false;
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                users[i].setId(id);
                users[i].setPassword(pass);
                users[i].setUsername(name);
                System.out.println("Updated successfully !!!");
            }
        }
        if (!updated) {
            System.out.println("ID is incorrect!!!");
        }
    }

    @Override
    public User get(int id) {
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }


    @Override
    public void login(int id, int pass) {
        boolean logged = false;
        for (int i = 0; i < count; i++) {
            if (users[i].getId() == id & users[i].getPassword() == pass) {
                System.out.println("Welcome " + users[i].getUsername());
                logged = true;
                break;
            }
        }
        if (!logged) {
            System.out.println("ID or Password entered incorrect !!!");
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
        if (count == 0) {
            System.out.println("No users found!!!");
        }
        return users1;
    }

}