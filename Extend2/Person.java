public class Person {
    private String name;
    private String address;

    /**
     * constructor.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * get Name.
     */
    public String getName() {
        return name;
    }

    /**
     * get address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * set Name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * set address.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * override toString object.
     */
    @Override
    public String toString() {
        String res = "";
        res = res + "Person[name=" + this.name + ",address=" + this.address + "]";
        return res;
    }
}