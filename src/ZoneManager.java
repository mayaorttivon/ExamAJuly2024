import java.util.ArrayList;
import java.util.Date;

public class ZoneManager extends Employee{

    private DistributionZone distributionZone;
    private ArrayList<Shipment> shipments;

    @Override
    public String toString() {
        return super.toString() + "ZoneManager{" +
                "distributionZone=" + distributionZone +
                ", shipments=" + shipments +
                '}';
    }

    public DistributionZone getDistributionZone() {
        return distributionZone;
    }

    public void setDistributionZone(DistributionZone distributionZone) {
        this.distributionZone = distributionZone;
    }

    public ArrayList<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(ArrayList<Shipment> shipments) {
        this.shipments = shipments;
    }

    public ZoneManager(int num, String name, DistributionZone distributionZone, ArrayList<Shipment> shipments) {
        super(num, name);
        this.distributionZone = distributionZone;
        this.shipments = shipments;
    }

    /**
     * Adds a new certified delivery to the shipments' arraylist.
     * @param postManNum
     * @param distributionZoneNum
     * @param certifiedDelivery
     * @throws InvalidDeliveryDetailsException
     */
    public void addCertifiedDeliveryDetails(int postManNum, String distributionZoneNum, Certified certifiedDelivery ) throws InvalidDeliveryDetailsException
    {
        if( postManNum != certifiedDelivery.getPostman().getNum() )
        {
            throw new InvalidDeliveryDetailsException("Wrong Postman Num");
        }
        if( !distributionZoneNum.equals(getDistributionZone().getZoneNum()) )
        {
            throw new InvalidDeliveryDetailsException("Wrong Distribution Zone number");
        }
        if( isExistShipment(certifiedDelivery))
        {
            throw new InvalidDeliveryDetailsException("Shipment already exist");
        }
        this.shipments.add(certifiedDelivery);
    }

    public boolean isExistShipment(Shipment shipment)
    {
        for (Shipment shipmentInShipments :
                this.shipments) {
            if (shipment.equals(shipmentInShipments))
            {
                return true;
            }
        }
        return false;
    }


}
