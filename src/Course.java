public class Course {
    private final String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[100];
        this.numberOfStudents = 0;
    }

    private void ensureCapacity() {
        if (numberOfStudents == students.length) {
            String[] newStudents = new String[students.length * 2];
            System.arraycopy(students, 0, newStudents, 0, students.length);
            students = newStudents;
        }
    }

    public void addStudent(String student) {
        ensureCapacity();
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[numberOfStudents - 1] = null;
                numberOfStudents--;
                return;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }

    /*
        Course course = new Course("Java Programming");

        course.addStudent("Alice");
        course.addStudent("Bob");
        course.addStudent("Charlie");

        System.out.println("Students in the course:");
        for (String student : course.getStudents()) {
            if (student != null) {
                System.out.println(student);
            }
        }

        course.dropStudent("Bob");

        System.out.println("\nStudents in the course after removing Bob:");
        for (String student : course.getStudents()) {
            if (student != null) {
                System.out.println(student);
            }
        }

        course.clear();
        System.out.println("\nAfter clearing the course, the number of students is: " + course.getNumberOfStudents());
     */
}

