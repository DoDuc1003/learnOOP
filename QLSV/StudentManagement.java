public class StudentManagement {
    private static Student[] students = new Student[100];
    private int quantity = 0;

    /**
     * Check same group.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals((s2.getGroup()))) {
            return true;
        }
        return false;
    }

    /**
     * add student.
     */
    public void addStudent(Student newStudent) {
        if (quantity >= 100) {
            return;
        }
        students[quantity] = new Student(newStudent);
        quantity++;
    }

    /**
     * print student by group.
     */
    public String studentsByGroup() {
        String res = "";
        boolean[] use = new boolean[100];
        for (int i = 0; i < 100; i++) {
            use[i] = false;
        }
        for (int i = 0; i < quantity; i++) {
            if (use[i] == false) {
                res += students[i].getGroup() + '\n';
                res += students[i].getInfo() + '\n';
                for (int j = i + 1; j < quantity; j++) {
                    if (students[j].getGroup().equals(students[i].getGroup())) {
                        res += students[j].getInfo() + '\n';
                        use[j] = true;
                    }
                }
            }
        }
        return res;
    }

    /**
     * remove student.
     */
    public void removeStudent(String id) {
        int pos = 0;
        for (int i = 0; i < quantity; i++) {
            if (students[i].getId().equals(id)) {
                pos = i;
                break;
            }
        }
        if (pos == 99) {
            quantity--;
            return;
        }
        for (int i = pos; i < quantity - 1; i++) {
            Student t = new Student(students[i + 1]);
            students[i] = t;
        }
        quantity -= 1;
    }
}

