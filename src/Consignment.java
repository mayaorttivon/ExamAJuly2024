import java.util.Date;

public class Consignment extends Shipment{
    private double weight;

    @Override
    public String toString() {
        return super.toString() + "Consignment{" +
                "weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Consignment(String code, POB pob, Date date, Postman shipment, double weight) {
        super(code, pob, date, shipment);
        this.weight = weight;
    }
}
