package studentmanagmentsys;

class SubjectMark {
    String subject;
    int mark;

    // Constructor
    public SubjectMark(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    // Getters and Setters (optional)
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return subject + ": " + mark;
    }
}
