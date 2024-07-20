public abstract class Employee {
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
