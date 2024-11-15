package user;

public class User {
    private int id;
    private String username;
    private int password;

    public User(int ID, String Username, int password) {
        this.id = ID;
        this.username = Username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(int ID) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User info: " +
                "id=" + id +
                ", username=" + username +
                ", password=" + password;
    }
}