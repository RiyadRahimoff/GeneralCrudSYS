package studentp;

public class StudentServiceHandler implements StudentService {
    Student[] students = new Student[100];
    private int count = 0;
    private int id = 1;

    @Override
    public void add(String name, int age) {
        if (count < students.length) {
            students[count++] = new Student(id, name, age);
            System.out.println("Student added sucessfully !!! ");
            System.out.println("Your id: " + id);
            id++;
        } else {
            System.out.println("Data is full !!!");
        }
    }

    @Override
    public void delete(int id) {
        boolean founded = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Student removed !!!");
                founded = true;
                break; 
            }
        }
        if (!founded) {
            System.out.println("Matching ID not found !!!");
        }
    }

    @Override
    public void update(int id, String name, int age) {
        boolean updated = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setName(name);
                students[i].setAge(age);
                System.out.println("Successfully updated!!!");
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("ID is incorrect!!!");
        }
    }

    @Override
    public Student getStudent(int id) {
        boolean get =false;
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                System.out.print("Student with id: " + id + "  found: ");
                return students[i];
            }
        }

        if (!get) {
            System.out.println("ID is incorrect!!!");
        }
        return null;
    }

    @Override
    public Student[] getAll() {
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                count++;
            }
        }

        Student[] students1 = new Student[count];
        int index = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                students1[index++] = students[i];
            }
        }
        if (count == 0) {
            System.out.println("No students found!");
        }

        return students1;

    }


}
