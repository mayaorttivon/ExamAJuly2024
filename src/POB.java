public class POB {
    private int num;
    private String street;
    private String neighberhood;

    @Override
    public String toString() {
        return "POB{" +
                "num=" + num +
                ", street='" + street + '\'' +
                ", neighberhood='" + neighberhood + '\'' +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNeighberhood() {
        return neighberhood;
    }

    public void setNeighberhood(String neighberhood) {
        this.neighberhood = neighberhood;
    }

    public POB(int num, String street, String neighberhood) {
        this.num = num;
        this.street = street;
        this.neighberhood = neighberhood;
    }
}
