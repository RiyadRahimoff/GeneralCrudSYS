package studentmanagmentsys;

import exception.MarkException;

public class Main {
    public static void main(String[] args) throws MarkException {
        try {
            Student student1 = new Student("Riyad", 18, 101);
            Student student2 = new Student("Fidan", 18, 102);

            student1.addSubjectAndMark("Math", 85);
            student1.addSubjectAndMark("Physics", 90);

            student2.addSubjectAndMark("Math", 95);
            student2.addSubjectAndMark("Chemistry", 88);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
