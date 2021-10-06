public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * set program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * set year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * set fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * get program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * get year.
     */
    public int getYear() {
        return year;
    }

    /**
     * get fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * override to String.
     */
    @Override
    public String toString() {
        String res = "";
        res = res + "Student[" + super.toString();
        res = res + ",program=" + program;
        res = res + ",year=" + year;
        res = res + ",fee=" + fee + "]";
        return res;
    }
}
