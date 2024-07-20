import java.util.Date;

public class Express extends Shipment implements Accelerated{
    private boolean isSent;
    public static final int ACCELERATED_SHIPMENT_DURATION = 1;

    public Express(String code, POB pob, Date date, Postman postman, boolean isSent) {
        super(code, pob, date, postman);
        this.isSent = isSent;
    }

    @Override
    public String toString() {
        return super.toString() + "Express{" +
                "isSent=" + isSent +
                '}';
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    @Override
    public int getShipmentDuration() {
        return ACCELERATED_SHIPMENT_DURATION;
    }
}
