import java.util.Date;

public abstract class Shipment {
    private String code;
    private POB pob;
    private Date date;
    private Postman postman;

    public Shipment(String code, POB pob, Date date, Postman postman) {
        this.code = code;
        this.pob = pob;
        this.date = date;
        this.postman = postman;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "code='" + code + '\'' +
                ", pob=" + pob +
                ", date=" + date +
                ", shipment=" + postman +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public POB getPob() {
        return pob;
    }

    public void setPob(POB pob) {
        this.pob = pob;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Postman getPostman() {
        return postman;
    }

    public void setPostman(Postman postman) {
        this.postman = postman;
    }

    @Override
    public boolean equals(Object obj) {
        return getCode().equals(((Shipment)obj).getCode());
    }
}
