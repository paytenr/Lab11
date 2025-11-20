public class Person implements Comparable<Person> {
    private int age, zip;
    private String name, address;
    private double Salary;

    public Person() {
        this.age = 0;
        this.name = "";
        this.address = "";
        this.zip = 0;
        this.Salary = 0;
    }

    public Person(int age, String name, String address, int zip, double salary) {
        setAge(age);
        setName(name);
        setAddress(address);
        setZip(zip);
        setSalary(salary);
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(other.Salary, this.Salary);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d $%,3.2f", getAge(), getName(), getAddress(), getZip(), getSalary());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}
