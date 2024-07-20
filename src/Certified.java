import java.util.Date;

public class Certified extends Shipment implements Accelerated{
    private Date sentDate;
    private POB fromPOB;

    public static final int ACCELERATED_SHIPMENT_DURATION = 2;

    public POB getFromPOB() {
        return fromPOB;
    }

    public void setFromPOB(POB fromPOB) {
        this.fromPOB = fromPOB;
    }

    public Certified(String code, POB toPOB, Date date, Postman shipment, Date sentDate, POB fromPOB) {
        super(code, toPOB, date, shipment);
        this.sentDate = sentDate;
        this.fromPOB = fromPOB;
    }

    @Override
    public String toString() {
        return super.toString() + "Certified{" +
                "sentDate=" + sentDate +
                '}';
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    @Override
    public int getShipmentDuration() {
        return ACCELERATED_SHIPMENT_DURATION;
    }
}
