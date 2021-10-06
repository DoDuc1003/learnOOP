public class Student {
    public static void main(String[] args) {

    }
    
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * constructor no parameter.
     */
    public Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * constructor have 3 parameter.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * constructor special.
     */
    public Student(Student s) {
        this.name = s.getName();
        this.id = s.getId();
        this.group = s.getGroup();
        this.email = s.getEmail();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String n) {
        this.group = n;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String n) {
        this.id = n;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String n) {
        this.email = n;
    }

    public String getInfo() {
        return this.name + " - " + this.id + " - " + this.group + " - " + this.email;
    }
}
