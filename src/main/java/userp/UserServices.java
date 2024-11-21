package userp;

public interface UserServices {
    void add(String name, int password);

    void delete(int id);

    void update(int id, String name, int pass);

    User get(int id);

    void login(int id, int pass);

    User[] getAll();


}