package studentp;

import user.User;

public class StudentServiceHandler implements StudentService {
    Student[] students = new Student[100];
    int count = 0;
    public int idAuto = 1;

    @Override
    public void add(Student student) {
        if (count < students.length) {
            students[count++] = student;
            System.out.println("Student added sucessfully !!! ");
            System.out.println("Each user has own unique ID. Don't forget ID");
            System.out.println("Your id: " + idAuto);
            idAuto++;
        } else {
            System.out.println("Data is full !!!");
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Student removed !!!");
                return;
            }
        }
        System.out.println("ID is not correct");
    }

    @Override
    public void update(int id, String name, int age) {
       for (int i =0;i<count;i++){
           if(students[i].getId()==id){
               students[i].setAge(age);
               students[i].setName(name);
               System.out.println("Sucessfully updated!!!");
           }
       }
    }

    @Override
    public void getStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                System.out.println("ID: " + students[i].getId() + "," + "Username: "
                        + students[i].getName() + "," + "Age: " + students[i].getAge());
                return;
            }

        }
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

        return students1;
    }


}
