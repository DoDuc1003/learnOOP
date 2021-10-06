public class Staff extends  Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * get school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * get pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * set School.
     * @param school .
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * set pay.
     * @param pay .
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * override.
     */
    @Override
    public String toString() {
        String res = "Staff[";
        res = res + super.toString() + ",";
        res = res + "school=" + school + ",pay=" + pay + "]";
        return res;
    }
}
