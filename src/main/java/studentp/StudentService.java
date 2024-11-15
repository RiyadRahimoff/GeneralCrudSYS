package studentp;

public interface StudentService {
    void add(String name, int age);

    void delete(int id);

    void update(int id, String name, int age);

    Student getStudent(int id);

    Student[] getAll();

}